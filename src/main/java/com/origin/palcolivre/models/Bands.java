package com.origin.palcolivre.models;

import org.springframework.data.annotation.Id;;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Bands {
    @NotNull
    @Id
    private String id;
    @NotBlank
    @NotNull
    @NotEmpty
    private String title;
    private User owner;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
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
    private List<Cities> region;

    Bands(User user){
        LocalDateTime date = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
        this.created_at = date;
        this.updated_at = date;
        this.owner = user;
    }
}
