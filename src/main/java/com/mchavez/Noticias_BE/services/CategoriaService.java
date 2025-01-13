package com.mchavez.Noticias_BE.services;

import com.mchavez.Noticias_BE.models.Categoria;
import com.mchavez.Noticias_BE.models.Noticia;
import com.mchavez.Noticias_BE.repositories.CategoriaRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRespository categoriaRespository;

    public void saveCategoria(Categoria categoria){
        categoriaRespository.save(categoria);
    }

    public List<Categoria> findAll (){
        return categoriaRespository.findAll();
    }

    public Optional<Categoria> findById(String id){
        return categoriaRespository.findById(id);
    }
}
