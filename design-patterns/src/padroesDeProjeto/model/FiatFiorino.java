package padroesDeProjeto.model;

import padroesDeProjeto.interfaces.IModeloVeiculo;

public class FiatFiorino implements IModeloVeiculo {

    private String nomeModelo;

    public FiatFiorino(){
        this.nomeModelo = "Fiat Fiorino";
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
