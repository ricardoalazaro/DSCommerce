package com.ricardolazaro.DSComerce.repositories;

import com.ricardolazaro.DSComerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
