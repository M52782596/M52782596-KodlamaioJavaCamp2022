package com.mervan.spring_giris_odev1.cores.concretes;

import com.mervan.spring_giris_odev1.bussines.abstracts.LanguageService;
import com.mervan.spring_giris_odev1.bussines.concretes.LanguageManager;
import com.mervan.spring_giris_odev1.data_access.abstracts.ILanguageRepository;
import com.mervan.spring_giris_odev1.entity.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public enum Validation {
    ;


   public static boolean isValid(Language language){
       if(language==null){
          throw new NullPointerException("Null değer atanamaz");
       }
       if(language.getName().isEmpty()){
           return false;
       }
       if(language.getId()<=0){
           throw  new IllegalArgumentException("id değeri negatif yada sıfır olamaz");
       }
       return true;
   }

}
