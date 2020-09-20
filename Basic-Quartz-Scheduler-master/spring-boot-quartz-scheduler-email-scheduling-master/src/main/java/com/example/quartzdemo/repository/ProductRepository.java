package com.example.quartzdemo.repository;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository {

    @Query(value = "select u.email, pv.metadata, p.name, p.brand, p.description from " +
            "user u inner join product p on u.id = p.seller_user_id " +
            "inner join product_variation pv on p.id = pv.product_id where pv.quantity_available =0", nativeQuery = true)
    public List<Object[]> getDetailedProductAndEmailWithProductVariationNone();
}
