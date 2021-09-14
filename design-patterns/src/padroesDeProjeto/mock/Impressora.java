package padroesDeProjeto.mock;

public class Impressora {
    public void imprimir(String conteudo, boolean pretoBranco) {

        if(pretoBranco) {
            System.out.println(conteudo);
        }else {
            System.err.println(conteudo);
        }
    }

}
