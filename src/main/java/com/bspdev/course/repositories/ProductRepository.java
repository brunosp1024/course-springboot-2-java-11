package com.bspdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bspdev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
