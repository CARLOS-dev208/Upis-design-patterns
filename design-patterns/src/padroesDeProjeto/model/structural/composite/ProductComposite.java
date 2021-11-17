package padroesDeProjeto.model.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductComposite implements ProductComponent{

    private List<ProductComponent> children;

    public ProductComposite() {
        children = new ArrayList<>();
    }

    void add(List<ProductComponent> products) {
        children.addAll(products);
    }

    void add(ProductComponent product) {
        children.add(product);
    }


    @Override
    public Double getPrice() {
//        return children.stream().mapToDouble(ProductComponent::getPrice).sum();
        return calculatePrice();
    }

   private Double calculatePrice(){
        double priceFinal = 0;
        for (ProductComponent product : children){
            priceFinal += product.getPrice();
        }
        return priceFinal;
    }

    @Override
    public String toString() {
        return "\nProductComposite{\n" +
                "       children=" + children +
                "}\n";
    }
}
