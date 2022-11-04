package com.mervan.spring_giris_odev2.data_access.abstracts;


import com.mervan.spring_giris_odev2.dtos.response.ResponseLanguage;
import com.mervan.spring_giris_odev2.entity.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ILanguageRepository extends JpaRepository<Language,Integer> {

      public Language findLanguageByName(String name);
      @Query("select new com.mervan.spring_giris_odev2.dtos.response.ResponseLanguage(l.id,l.name) from Language as l")
      public List<ResponseLanguage> findAllLanguage();
      @Query("select new com.mervan.spring_giris_odev2.dtos.response.ResponseLanguage(l.id,l.name) from Language as l where l.id=:id")
      public ResponseLanguage findResponseLanguageById(int id);
}
