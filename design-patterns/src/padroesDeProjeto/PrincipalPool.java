package padroesDeProjeto;

import padroesDeProjeto.model.PoolSingleton;

public class PrincipalPool {
    public static void main(String[] args) {
        for(int k = 0; k < 10; k++) {
            PoolSingleton s = PoolSingleton.getInstance();
            s.getImpressora().imprimir(Integer.toString(k).concat("-").concat(s.toString()), k % 2 != 0);
            System.out.println(s);

        }


    }
}
