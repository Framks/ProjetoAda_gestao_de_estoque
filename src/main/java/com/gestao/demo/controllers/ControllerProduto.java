package com.gestao.demo.controllers;

import com.gestao.demo.models.Produto;
import com.gestao.demo.sevices.ServiceProduto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ControllerProduto {
    private final ServiceProduto serviceProduto;

    public ControllerProduto(ServiceProduto serviceProduto){
        this.serviceProduto = serviceProduto;
    }

    @GetMapping("/tudo")
    public List<Produto> all(){
        return this.serviceProduto.all();
    }

    @GetMapping("/quantidadeDeProdutoPorCategoria")
    public HashMap<String, Long> quantidadeDeProdutoPorCategoria(){
        return serviceProduto.qtdPorCategoria();
    }

    @GetMapping("/valorMedioPorCategoria")
    public HashMap<String, Double> valorMedioPorCategoria(){
        return this.serviceProduto.valorMedioPorCategoria();
    }

    @GetMapping("/valorMedioDosProdutos")
    public Double valorMedioDosProdutos(){
        return this.serviceProduto.qtdMedPorPro();
    }

    @GetMapping("/quantidadeDeCategoria")
    public Integer quantidaDCategoria(){
        return this.serviceProduto.qtdDeCat();
    }

    @GetMapping("/quantidadeBaixa")
    public List<Produto> quantidadeBaixa(){
        return this.serviceProduto.quantidadeBaixa();
    }
}
