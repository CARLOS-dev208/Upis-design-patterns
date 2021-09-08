package padroesDeProjeto.model;

import padroesDeProjeto.interfaces.IModeloVeiculo;

public class FiatUno implements IModeloVeiculo {

    private String nomeModelo;

    public FiatUno(){
        this.nomeModelo = "Fiat Uno";
    }

    @Override
    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    @Override
    public String getNomeModelo() {
        return nomeModelo;
    }
}
