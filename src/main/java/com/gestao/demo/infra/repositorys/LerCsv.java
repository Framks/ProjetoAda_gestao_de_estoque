package com.gestao.demo.infra.repositorys;

import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class LerCsv {
    private String caminho;

    public LerCsv(String caminho){
        this.caminho = caminho;
    }

    public List<List<String>> getList() throws IOException {
        List<List<String>> listTwoDemincion = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(this.caminho));
        String linha;
        br.readLine();

        while ((linha = br.readLine()) != null){
            String[] valores = linha.split(",");
            listTwoDemincion.add(Arrays.stream(valores).toList());
        }

        return listTwoDemincion;
    }

}
