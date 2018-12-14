package com.wk.shopp.comparator;


import com.wk.shopp.pojo.Product;
import java.util.Comparator;

public class ProductDateComparator implements Comparator<Product> {
 
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getCreatedate().compareTo(p2.getCreatedate());
    }
 
}