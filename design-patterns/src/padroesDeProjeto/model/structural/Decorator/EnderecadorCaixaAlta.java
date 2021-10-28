package padroesDeProjeto.model.structural.Decorator;

public class EnderecadorCaixaAlta extends EnderecadorDecorator{

    public EnderecadorCaixaAlta(IEnderecador enderecador) {
        super(enderecador);
    }
    @Override
    public String preparaEndereco(Endereco endereco) {
        return enderecador.preparaEndereco(endereco).toUpperCase();
    }
}
