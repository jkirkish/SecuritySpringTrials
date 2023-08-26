package com.coderscampus.springsecuritypractice.domain;

import java.math.BigDecimal;

public record Product(
        Integer id,
        String name,
        BigDecimal price) {
}
