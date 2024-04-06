package com.gestao.demo.infra.repositorys;

import com.gestao.demo.models.Produto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryProduto {
    private final JdbcTemplate jdbcTemplate;

    public RepositoryProduto(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Produto> list() {
        String sql = "SELECT * FROM produto";
        RowMapper<Produto> rowMapper = ((rs, rowNum) ->
                new Produto(rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("categoria"),
                        rs.getInt("quantidade"),
                        rs.getDouble("preco")
                )
        );
        return this.jdbcTemplate.query(sql,rowMapper);
    }

    public void insert(Produto produto){
        String sql = "INSERT INTO produto (nome,categoria,preco,quantidade) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql,produto.getNome(),produto.getCategoria(),produto.getpreco(),produto.getQuantidade());
    }
}
