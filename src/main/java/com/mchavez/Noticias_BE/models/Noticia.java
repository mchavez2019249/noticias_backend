package com.mchavez.Noticias_BE.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Noticias")
@Data
public class Noticia {
    @Id
    private String id;
    private String title;
    private String description;
    private String image;
}
