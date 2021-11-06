package padroesDeProjeto.model.structural.Adapter;

public class Adapter implements Target{
    private static final int  Error = 0;
    private static final int WARNING_MESSAGE = 2;

    private Adaptee adaptee;

    public Adapter() {
        adaptee = new Adaptee();
    }

    @Override
    public void exibirMensagem(String msg, int tipo) {
        String mensagem = "";

        switch (tipo) {
            case Error:
                mensagem = "Error: " + msg;
                break;
            case WARNING_MESSAGE:
                mensagem = "Perigo: " + msg;
                break;
            default:
                mensagem = "Informação: " + msg;
                break;
        }

        adaptee.exibirMensagem(mensagem);
    }

}
