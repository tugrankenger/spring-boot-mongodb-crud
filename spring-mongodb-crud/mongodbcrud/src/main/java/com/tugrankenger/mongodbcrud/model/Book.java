package com.tugrankenger.mongodbcrud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Document(collection="Book")
public class Book{

    @Id
    private int id;
    private String bookName;
    private String authorName;
    
}
