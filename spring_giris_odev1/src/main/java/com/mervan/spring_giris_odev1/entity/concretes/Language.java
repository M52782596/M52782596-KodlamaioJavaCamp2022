package com.mervan.spring_giris_odev1.entity.concretes;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"name","id"})

public class Language {


    private int id;
    private String name;

}
