package com.coffeeshop.example.services;

import com.coffeeshop.example.models.category.jpa.ProductCategoryJpaEntity;
import com.coffeeshop.example.models.product.jpa.ProductJpaEntity;

import java.util.List;

/**
 * Created by easikoglu on 30/01/16.
 */
public interface ProductService extends GenericService<ProductJpaEntity,Long> {

 List<ProductJpaEntity> findByCategory(ProductCategoryJpaEntity categoryJpaEntity);
}
