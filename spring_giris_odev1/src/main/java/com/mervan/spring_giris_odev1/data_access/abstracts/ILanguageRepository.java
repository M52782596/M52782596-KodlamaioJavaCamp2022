package com.mervan.spring_giris_odev1.data_access.abstracts;

import com.mervan.spring_giris_odev1.entity.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ILanguageRepository{
    public void add(Language language);
    public List<Language> getAll();
    public void put(Language language,int index);
    public void delete(int id);
    public void delete(Language language);
    public Language findById(int id);

}
