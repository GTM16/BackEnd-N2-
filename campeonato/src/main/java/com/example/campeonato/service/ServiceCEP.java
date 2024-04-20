package com.example.campeonato.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceCEP implements IntService {
    private final String uri = "https://viacep.com.br/ws/";

    @Override
    public String consultarCEP(String cep) {
        String link = uri + cep + "/json/";
        return link;
    }

    @Override
    public String calcularDistancia() {
        int OrigemCEP = (int) (Math.random() * 991) + 10;
        int DestinoCEP = (int) (Math.random() * 991) + 10;

        int DistanciaCEP;
        if (OrigemCEP > DestinoCEP) {
            DistanciaCEP = OrigemCEP - DestinoCEP;
        } else {
            DistanciaCEP = DestinoCEP - OrigemCEP;
        }
        return "A Distância entre o CEP " + OrigemCEP + " e o CEP " + DestinoCEP + " é " + DistanciaCEP + " Km";

    }
}
