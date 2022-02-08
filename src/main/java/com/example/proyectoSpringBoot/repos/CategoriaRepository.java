package com.example.proyectoSpringBoot.repos;

import com.example.proyectoSpringBoot.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

    @Query(value = "select * from Categorias where nombre=?1",nativeQuery = true)
    public Categoria getCategoriaByName(String nombre);



}
