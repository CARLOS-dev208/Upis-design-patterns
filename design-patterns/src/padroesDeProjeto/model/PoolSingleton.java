package padroesDeProjeto.model;

import padroesDeProjeto.mock.Impressora;

public class PoolSingleton {
    private static PoolSingleton instance[];

    private static int i;

    private static int MAXIMO = 5;

    private static Impressora impressora;

    private PoolSingleton() {

    }

    public synchronized  static  PoolSingleton getInstance(){

        //LAZY
        if(instance == null) {

            instance = new PoolSingleton[MAXIMO];
            impressora = new Impressora();

            criarInstancias();

        }
        i = i + 1;

        if(i == MAXIMO) {
            i = 0;
        }

        return instance[i];
    }

    private static void criarInstancias() {
        for(int j = 0; j < MAXIMO ; j++) {
            instance[j] = new PoolSingleton();
        }
    }

    public Impressora getImpressora() {
        return impressora;
    }
}
