package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NumeroRepository extends JpaRepository<Numero, Long>{

	List<Numero> findByName(@Param("n") int n);
}
