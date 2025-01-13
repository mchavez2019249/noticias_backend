package com.mchavez.Noticias_BE.repositories;

import com.mchavez.Noticias_BE.models.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRespository extends MongoRepository<Categoria, String> {
}
