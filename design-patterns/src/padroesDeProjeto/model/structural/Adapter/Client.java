package padroesDeProjeto.model.structural.Adapter;

public class Client {
    public static void main(String[] args) {

        Target t = new Adapter();

        t.exibirMensagem("Erro inesperado!", 0);

        t.exibirMensagem("Cuidado!", 2);

        t.exibirMensagem("Bugs 001!", 0);

        t.exibirMensagem("Seja bem vindo!", 4);
    }

}
