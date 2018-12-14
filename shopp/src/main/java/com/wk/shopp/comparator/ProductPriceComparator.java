package com.wk.shopp.comparator;


import com.wk.shopp.pojo.Product;
import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
 
    @Override
    public int compare(Product p1, Product p2) {
        return (int) (p1.getPromoteprice()-p2.getPromoteprice());
    }
 
}