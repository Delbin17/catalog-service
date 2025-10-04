package com.example.catalog.service.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class ProductEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_generator")
  @SequenceGenerator(name = "product_id_generator", sequenceName = "product_id_seq")
  private Long id;

  @Column(nullable = false, unique = true)
  @NotBlank(message = "Product code is required")
  private String code;

  @NotBlank(message = "Product name is required")
  @Column(nullable = false)
  private String name;

  private String description;

  private String imageUrl;

  @NotNull(message = "Product price is required")
  @DecimalMin("0.1")
  @Column(nullable = false)
  private BigDecimal price;

  ProductEntity() {}

  ProductEntity(Long id, String name, String description, String imageUrl, BigDecimal price) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.imageUrl = imageUrl;
    this.price = price;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {

    return description;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getPrice() {
    return price;
  }
}
