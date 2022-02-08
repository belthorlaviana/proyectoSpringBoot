package com.example.proyectoSpringBoot.controller;

import com.example.proyectoSpringBoot.entities.Categoria;
import com.example.proyectoSpringBoot.repos.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CategoriaController")
public class CategoriaController {

    @Autowired
    CategoriaRepository categoriaRepository;



    @GetMapping("/getCategorias")
    public List<Categoria> listUsers(){
        return categoriaRepository.findAll();
    }

    @GetMapping("/getCategoria/{id}")
    public Optional<Categoria> getCategory(@PathVariable Integer id){
        return categoriaRepository.findById(id);
    }

    @GetMapping("/getCategoriaByNombre/{nombre}")
    public Categoria getCategoryByNombre(@PathVariable String nombre){
        return categoriaRepository.getCategoriaByName(nombre);
    }

    @PostMapping("/postCategoria")
    public ResponseEntity<?> postCategoria(@RequestBody Categoria cat){
        Categoria save=categoriaRepository.save(cat);
        return ResponseEntity.ok(save);
    }
    //ESTO YE LO MISMO QUE EL METODO ANTERIOR
    @PostMapping("/postCategoria2")
    public ResponseEntity<?> postCategoria2(@RequestBody Categoria cat){
        Categoria save=categoriaRepository.save(cat);
        return new ResponseEntity<>(categoriaRepository.save(cat), HttpStatus.OK);
    }




}
