package com.mchavez.Noticias_BE.controllers;

import com.mchavez.Noticias_BE.models.Categoria;
import com.mchavez.Noticias_BE.services.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class CategoriaController {
    private final CategoriaService categoriaService;

    @PostMapping("/categoria")
    public void saveCategoria(@RequestBody Categoria categoria){
        categoriaService.saveCategoria(categoria);
    }

    @GetMapping("/categorias")
    public List<Categoria> findAll(){
        return categoriaService.findAll();
    }
}
