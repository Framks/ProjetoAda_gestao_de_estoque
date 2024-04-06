package com.gestao.demo.infra.components;

import com.gestao.demo.infra.repositorys.LerCsv;
import com.gestao.demo.infra.repositorys.RepositoryProduto;
import com.gestao.demo.models.Produto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ComponentCsv {

    private final RepositoryProduto repositoryProduto;
    private final LerCsv lerCsv;

    private Runnable executador;

    public ComponentCsv(RepositoryProduto repositoryProduto){
        this.repositoryProduto = repositoryProduto;
        this.lerCsv = new LerCsv("bancoDeDados/Arquivo.csv");

        executador = new Runnable() {
            @Override
            public void run() {
                try {
                    lerCsv.getList().forEach(x -> repositoryProduto.insert(
                            new Produto(
                                    Long.parseLong(x.get(0)),
                                    x.get(1),
                                    x.get(2),
                                    Integer.parseInt(x.get(3)),
                                    Double.parseDouble(x.get(4)))
                            )
                    );
                } catch (IOException e) {
                    System.out.println("error ao ler o arquivo ou ao inserir no banco de dados: "+e.getMessage());
                }
            }
        };
    }

    @PostConstruct
    public void run(){
        executador.run();
    }

}
