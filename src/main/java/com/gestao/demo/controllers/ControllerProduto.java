package com.gestao.demo.controllers;

import com.gestao.demo.sevices.ServiceProduto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerProduto {
    private final ServiceProduto serviceProduto;

    public ControllerProduto(ServiceProduto serviceProduto){
        this.serviceProduto = serviceProduto;
    }

    @GetMapping("/quantidadePorCategoria")
    public void quantidadeCategoria(){

    }

    @GetMapping("/valorMedioPorCategoria")
    public void valorMedioPorCategoria(){

    }

    @GetMapping("/valorMedioDosProdutos")
    public void valorMedioDosProdutos(){

    }

    @GetMapping("/quantidadeDeProdutoPorCategoria")
    public void quantidaDeProdutoPorCategoria(){

    }
}
