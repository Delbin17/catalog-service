package com.example.catalog.service.domain;

import java.util.List;

public record PagedResult<T>(
    List<T> Data,
    long totalElement,
    int pageNumber,
    int totalPages,
    boolean isFirst,
    boolean isLast,
    boolean hasNext,
    boolean hasPrevious) {}
