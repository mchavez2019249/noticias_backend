package com.mchavez.Noticias_BE.controllers;

import com.mchavez.Noticias_BE.models.Noticia;
import com.mchavez.Noticias_BE.services.NoticiaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class NoticiaController {
    private final NoticiaService noticiaService;

    @PostMapping("/noticia")
    public void saveNoticia(@RequestBody Noticia noticia){
        noticiaService.saveNoticia(noticia);
    }

    @GetMapping("/noticias")
    public List<Noticia> findAll(){
      return noticiaService.findAll();
    }

    @GetMapping("/noticia/{id}")
    public Noticia findById(@PathVariable String id){
        return noticiaService.findById(id).get();
    }

    @GetMapping("/noticia/categoria/{categoryId}")
    public List<Noticia> findByCategoryId(@PathVariable String categoryId){
        return noticiaService.findAllByCategoryId(categoryId);
    }

}
