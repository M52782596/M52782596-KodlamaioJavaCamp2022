package com.mervan.spring_giris_odev2.dtos.response;

import com.mervan.spring_giris_odev2.entity.concretes.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseTecnology {
    private int id;
    private String name;
    private Language language;
}
