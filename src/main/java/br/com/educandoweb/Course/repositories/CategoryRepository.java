package br.com.educandoweb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.educandoweb.Course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}