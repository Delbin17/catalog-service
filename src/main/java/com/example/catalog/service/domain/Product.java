package com.example.catalog.service.domain;

public record Product(
    String code, String name, String description, String price, String imageUrl) {}
