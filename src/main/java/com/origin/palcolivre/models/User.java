package com.origin.palcolivre.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Document
@Data
public class User {
    @NotNull
    @Id
    private String id;
    @NotNull
    @NotBlank
    @NotEmpty
    @Email
    private String email;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min=10, max=30)
    private String password;
    private String city;
    private String country;
    private String district;
    private String zipcode;

    private List<Style> styles;
    private List<String> instagram;
    private List<String> cellphone;
    private List<String> facebook;
    private List<String> soundcloud;
    private List<String> spotify;
    private List<String> whatsapp;
    private List<String> permissions;
    private List<String> associateds;
    private List<String> youtube;
    private List<String> bands;

    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public User(){
        LocalDateTime date = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
        this.created_at = date;
        this.updated_at = date;
    }

    public User(String password, String email){
        this();
        this.password = password;
        this.email = email;
    }

    public User(String bands){
        this.bands.add(bands);
    }
}
