package com.example.catalog.service.domain;

class ProductMapper {

  public static Product toProduct(ProductEntity productEntity) {
    return new Product(
        productEntity.getCode(),
        productEntity.getName(),
        productEntity.getDescription(),
        productEntity.getPrice().toPlainString(),
        productEntity.getImageUrl());
  }
}
