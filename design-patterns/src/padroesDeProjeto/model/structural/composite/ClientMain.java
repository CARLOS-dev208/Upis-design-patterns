package padroesDeProjeto.model.structural.composite;

import java.util.Arrays;

public class ClientMain {
    public static void main(String[] args) {

        ProductComponent caneta = new ProductLeaf("caneta", 5);
        ProductComponent celular = new ProductLeaf("celular", 5);
        ProductComponent camiseta = new ProductLeaf("camiseta", 5);

        var caixaDeProdutos = new ProductComposite();
        caixaDeProdutos.add(Arrays.asList(caneta, celular,camiseta));


        ProductComponent tablete = new ProductLeaf("tablete", 5);
        ProductComponent acender = new ProductLeaf("acender", 5);
        var caixaDeProdutos2 = new ProductComposite();
        caixaDeProdutos2.add(Arrays.asList(tablete, acender));

        caixaDeProdutos.add(caixaDeProdutos2);

        System.out.println(caixaDeProdutos);
        System.out.println("Preço total: " +  caixaDeProdutos.getPrice());
    }
}
