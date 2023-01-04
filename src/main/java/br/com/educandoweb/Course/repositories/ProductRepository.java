package br.com.educandoweb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.educandoweb.Course.entities.*;

public interface ProductRepository extends JpaRepository<Product, Long> {

}