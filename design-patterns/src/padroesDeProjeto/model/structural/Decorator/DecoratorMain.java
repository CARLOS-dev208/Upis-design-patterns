package padroesDeProjeto.model.structural.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 4 Casa 144", "Centro", "São José", "RN", "50940-144");

        IEnderecador enderecador = new EnderecadorSimples();
        enderecador = new EnderecadorCaixaAlta(enderecador);
        enderecador = new EnderecadorComBorda(enderecador);

        String enderecoFormatado = enderecador.preparaEndereco(endereco);

        System.out.println(enderecoFormatado);
    }
}
