package com.gestao.demo.infra.components;

import com.gestao.demo.infra.repositorys.RepositoryProduto;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ComponentCsv {
    private final RepositoryProduto repositoryProduto;
    private final Thread thread;

    public ComponentCsv(RepositoryProduto repositoryProduto){
        this.repositoryProduto = repositoryProduto;
        this.thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

    }

    @PostConstruct
    public void init(){
        thread.run();
    }

    @PreDestroy
    public void stop(){

    }
}
