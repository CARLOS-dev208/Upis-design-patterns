package padroesDeProjeto.model.structural.Decorator;

abstract class EnderecadorDecorator implements IEnderecador{
    IEnderecador enderecador;

    public EnderecadorDecorator(IEnderecador enderecador) {
        super();
        this.enderecador = enderecador;
    }
}

