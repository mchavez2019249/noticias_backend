package com.mchavez.Noticias_BE.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(value = "Noticias")
@Data
public class Noticia {
    @Id
    private String id;
    private String title;
    private String description;
    private String image;
    private String categoryId;
    private Date publicationDate;
    private String author;
}
