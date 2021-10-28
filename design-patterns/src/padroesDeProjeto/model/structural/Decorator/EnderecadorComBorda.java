package padroesDeProjeto.model.structural.Decorator;

public class EnderecadorComBorda extends EnderecadorDecorator{

    public EnderecadorComBorda(IEnderecador enderecador) {
        super(enderecador);
    }

    public String preparaEndereco(Endereco endereco) {
        String preparaEndereco = enderecador.preparaEndereco(endereco);
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------\n");
        preparaEndereco.lines().forEach(l -> sb.append("| ").append(l).append("\n"));
        sb.append("---------------------");
        return sb.toString();
    }
}
