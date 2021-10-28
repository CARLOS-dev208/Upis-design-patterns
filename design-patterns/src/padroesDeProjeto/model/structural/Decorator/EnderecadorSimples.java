package padroesDeProjeto.model.structural.Decorator;

public class EnderecadorSimples implements IEnderecador{


    @Override
    public String preparaEndereco(Endereco endereco) {
        return endereco.logradouro +
                "\n" +
                endereco.bairro +
                "\n" +
                endereco.cidade +
                '/' +
                endereco.uf +
                "\n" +
                endereco.cep;
    }
}
