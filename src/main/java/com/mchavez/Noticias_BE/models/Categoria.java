package com.mchavez.Noticias_BE.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Categorias")
@Data
public class Categoria {
    @Id
    private String id;
    private String description;
}
