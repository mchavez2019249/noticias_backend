package com.mchavez.Noticias_BE.repositories;

import com.mchavez.Noticias_BE.models.Noticia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoticiaRepository extends MongoRepository<Noticia, String> {
    Optional<Noticia> findByCategoryId (String categoryId);
}
