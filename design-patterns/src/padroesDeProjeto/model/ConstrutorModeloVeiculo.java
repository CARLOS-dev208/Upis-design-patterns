package padroesDeProjeto.model;

import padroesDeProjeto.interfaces.IConstrucaoModeloVeiculo;
import padroesDeProjeto.interfaces.IModeloVeiculo;

public class ConstrutorModeloVeiculo implements IConstrucaoModeloVeiculo {


    @Override
    public IModeloVeiculo criar(String modeloVeiculo) {

        switch (modeloVeiculo) {
            case "FiatUno":
                return new FiatUno();
            case "FiatFiorino":
                return new FiatFiorino();
            case "FordRanger":
                return new FordRanger();
            case "HondaCivic":
                return new HondaCivic();
        }

        return null;
    }
}
