package padroesDeProjeto.model.structural.composite;


public class ProductLeaf implements ProductComponent {

    private String nome;
    private double price;

    public ProductLeaf(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }


    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "\n              ProductLeaf{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                '}';
    }
}
