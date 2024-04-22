package com.example.destino.controller;

import com.example.destino.models.Localizacao;
import com.example.destino.service.IntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ControllerCEP {
    @Autowired
    private IntService intService;

    @GetMapping("/consultarCEP")
    public String consultarCEP() {
        Localizacao localizacao = new Localizacao();
        localizacao.setCep("88845-000");
        localizacao.setLogradouro("Rua Avenida São João");
        localizacao.setBairro("Cristo Rei");
        localizacao.setUf("SC");

        return "Dados da Localização:\n" +
                "CEP: " + localizacao.getCep() + "\n" +
                "Logradouro: " + localizacao.getLogradouro() + "\n" +
                "Bairro: " + localizacao.getBairro() + "\n" +
                "UF: " + localizacao.getUf() + "\n\n" +
                intService.calcularDistancia();
    }
}
