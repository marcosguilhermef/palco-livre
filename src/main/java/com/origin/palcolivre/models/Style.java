package com.origin.palcolivre.models;

import org.springframework.data.annotation.Id;;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

public class Style {
    @NotNull
    @Id
    private String id;
    @NotBlank
    @NotNull
    @NotEmpty
    private String title;
    private String description;
    private String language;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public Style(){
        this.id = UUID.randomUUID().toString();
        LocalDateTime date = LocalDateTime.now();
        this.created_at = date;
        this.updated_at = date;
        this.language = "pt_BR";
    }

}
