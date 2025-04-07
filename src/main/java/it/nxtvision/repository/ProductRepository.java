package it.nxtvision.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.nxtvision.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
