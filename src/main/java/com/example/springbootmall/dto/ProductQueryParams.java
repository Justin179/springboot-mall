package com.example.springbootmall.dto;

import com.example.springbootmall.constant.ProductCategory;

public class ProductQueryParams {
    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    private ProductCategory category;
    private String search;
}
