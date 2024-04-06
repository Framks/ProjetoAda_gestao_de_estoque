package com.gestao.demo.sevices;

import com.gestao.demo.infra.repositorys.RepositoryProduto;
import com.gestao.demo.models.Produto;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ServiceProduto {

    private final RepositoryProduto repositoryProduto;

    public ServiceProduto(RepositoryProduto repositoryProduto){
        this.repositoryProduto = repositoryProduto;
    }

    public List<Produto> all(){
        return this.repositoryProduto.list();
    }

    public HashMap<String, Long> qtdPorCategoria(){
        List<Produto> produtos = repositoryProduto.list();
        HashMap<String,Long> qtdPCat = new HashMap<>();
        Set<String> categorias = new HashSet<>();
        // para cada p produto contido na lista produtos
        // se não estiver no set categorias
        // pegue a quantidade de vezes que essa categoria aparece na lista e coloque no hashmap(p categoria , count das categorias)
        // set categorias adciona a categoria para futuras verificações
        produtos.forEach((p) -> {
            Long qtd;
            if (!categorias.contains(p.getCategoria())){
                qtd = produtos.stream().filter(x -> x.getCategoria().equals(p.getCategoria())).count();
                qtdPCat.put(p.getCategoria(),qtd);
                categorias.add(p.getCategoria());
            }
        });
        return qtdPCat;
    }

    public HashMap<String, Double> valorMedioPorCategoria(){
        HashMap<String, Double> vaMePoCat = new HashMap<>();
        return null;
    }

    public Integer qtdDeCat(){
        List<Produto> produtos = this.repositoryProduto.list();
        Set<String> categorias = new HashSet<>();
        produtos.stream().filter(produto -> !categorias.contains(produto.getCategoria())).forEach(produto -> categorias.add(produto.getCategoria()));
        return categorias.size();
    }

    public Double qtdMedPorPro(){
        List<Produto> produtos = this.repositoryProduto.list();
        return produtos.stream().mapToDouble(Produto::getpreco).average().orElse(0.0);
    }

    public List<Produto> quantidadeBaixa(){
        List<Produto> produtos = this.repositoryProduto.list();
        return produtos.stream().filter(produto -> produto.getQuantidade() <= 3).toList();
    }
}
