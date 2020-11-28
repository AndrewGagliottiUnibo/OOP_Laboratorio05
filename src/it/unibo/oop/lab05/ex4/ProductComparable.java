package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ProductComparable extends ProductImpl implements Comparable<Product> {

    public ProductComparable(final String name, final double quantity) {
        super(name, quantity);
    }

    public int compareTo(final Product o) {
        return super.getName().compareTo(o.getName());
    }

}
