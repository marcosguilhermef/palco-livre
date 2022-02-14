package com.origin.palcolivre.models;

import org.springframework.data.annotation.Id;;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Cities {
    @NotNull
    @Id
    private String id;
    @NotNull
    @NotEmpty
    @NotBlank
    private String city;
    @NotNull
    @NotEmpty
    @NotBlank
    private String provincy;
    private Double lat;
    private Double lon;
    private Double alt;

    public Cities(String id, String city, String provincy) {
        this.id = UUID.randomUUID().toString();
        this.city = city;
        this.provincy = provincy;
    }
}
