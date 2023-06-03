package com.mjc.stage2.impl;

import com.mjc.stage2.FilteringStrategy;
import com.mjc.stage2.Product;

public class MaxPriceFilteringStrategy implements FilteringStrategy {
    private double maxPrice;

    public MaxPriceFilteringStrategy(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean filter(Product product) {
        return product.getPrice() <= maxPrice;
    }
}
