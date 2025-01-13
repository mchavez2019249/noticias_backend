package com.mchavez.Noticias_BE.services;

import com.mchavez.Noticias_BE.models.Noticia;
import com.mchavez.Noticias_BE.repositories.NoticiaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NoticiaService {
    private final NoticiaRepository noticiaRepository;

    public Noticia saveNoticia(Noticia noticia){
        return noticiaRepository.save(noticia);
    }

    public List<Noticia> findAll (){
        return noticiaRepository.findAll();
    }

    public Optional<Noticia> findById(String id){
        return noticiaRepository.findById(id);
    }

    public List<Noticia> findAllByCategoryId(String categoryId){
        return noticiaRepository.findAllByCategoryId(categoryId);
    }
}
