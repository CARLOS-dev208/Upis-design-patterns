package padroesDeProjeto.model.structural.Adapter;

import javax.swing.JOptionPane;

public class Adaptee2 {
    public void mostrarMensagem(String msg, int tipo) {
        String title = "";

        switch (tipo) {
            case JOptionPane.ERROR_MESSAGE:
                title = "Error";
                break;
            case JOptionPane.WARNING_MESSAGE:
                title = "Perigo";
                break;
            default:
                title = "Informação";
                break;
        }

        JOptionPane.showMessageDialog(null, msg, title, tipo);

    }


}
