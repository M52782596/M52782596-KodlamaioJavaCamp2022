package com.mervan.spring_giris_odev1.bussines.abstracts;

import com.mervan.spring_giris_odev1.entity.concretes.Language;

import java.util.List;

public interface LanguageService {
    public void add(Language language);
    public List<Language> getAll();
    public void put(Language language);
    public void delete(int id);
    public void delete(Language language);
    public Language findById(int id);
}
