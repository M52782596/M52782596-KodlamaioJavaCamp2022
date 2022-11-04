package com.mervan.spring_giris_odev2.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestTecnology {
    private String name;
    private int languade_id;
}
