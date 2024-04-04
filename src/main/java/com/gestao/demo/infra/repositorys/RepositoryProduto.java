package com.gestao.demo.infra.repositorys;

import com.gestao.demo.models.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

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

    public void delete(Produto produto){

    }

    public void update(Produto produto){

    }
}
