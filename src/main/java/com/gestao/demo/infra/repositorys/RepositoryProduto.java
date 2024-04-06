package com.gestao.demo.infra.repositorys;

import com.gestao.demo.models.Produto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryProduto {
    private final JdbcTemplate jdbcTemplate;

    public RepositoryProduto(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Produto> list(){
        return null;
    }

    public void insert(Produto produto){

    }
}
