package br.com.educandoweb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.educandoweb.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
