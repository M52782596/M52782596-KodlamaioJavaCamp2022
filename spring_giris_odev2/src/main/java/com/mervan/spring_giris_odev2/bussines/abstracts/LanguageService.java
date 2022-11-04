package com.mervan.spring_giris_odev2.bussines.abstracts;


import com.mervan.spring_giris_odev2.dtos.request.RequestLanguage;
import com.mervan.spring_giris_odev2.dtos.response.ResponseLanguage;
import com.mervan.spring_giris_odev2.entity.concretes.Language;

import java.util.List;

public interface LanguageService {
    public void add(RequestLanguage language)throws Exception;
    public List<ResponseLanguage> getAll();
    public void update(RequestLanguage language,int id) throws Exception;
    public void delete(int id) throws Exception;

    public ResponseLanguage findResponseLanguageById(int id) throws Exception;
    public Language ExistLanguageById(int id) throws Exception;
}
