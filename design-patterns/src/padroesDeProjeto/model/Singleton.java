package padroesDeProjeto.model;

import padroesDeProjeto.mock.Impressora;

public class Singleton {
    private static Singleton instance;
    private Impressora impressora;
    private Singleton(){}

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public Impressora getImpressora() {
        return new Impressora();
    }
}
