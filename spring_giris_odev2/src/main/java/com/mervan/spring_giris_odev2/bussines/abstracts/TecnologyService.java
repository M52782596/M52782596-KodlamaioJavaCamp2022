package com.mervan.spring_giris_odev2.bussines.abstracts;


import com.mervan.spring_giris_odev2.dtos.request.RequestTecnology;
import com.mervan.spring_giris_odev2.dtos.response.ResponseLanguage;
import com.mervan.spring_giris_odev2.dtos.response.ResponseTecnology;
import com.mervan.spring_giris_odev2.entity.concretes.Language;
import com.mervan.spring_giris_odev2.entity.concretes.SubTecnology;

import java.util.List;

public interface TecnologyService {
    public void add(RequestTecnology tecnology) throws Exception;
    public List<ResponseTecnology> getAll();
    public void update(RequestTecnology tecnology,int id) throws Exception;
    public void delete(int id) throws Exception;
    public ResponseTecnology findResponseTecnologyById(int id) throws Exception;
    public SubTecnology ExistTecnologyById(int id) throws Exception;
}
