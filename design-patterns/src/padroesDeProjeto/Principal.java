package padroesDeProjeto;

import padroesDeProjeto.model.Singleton;

public class Principal {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.getImpressora().imprimir("Instance1", false);
        System.out.println(s1);

        Singleton s2 = Singleton.getInstance();
        s2.getImpressora().imprimir("Instance2", true);
        System.out.println(s2);

    }
}
