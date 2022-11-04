package com.mervan.spring_giris_odev2.bussines.concretes;


import com.mervan.spring_giris_odev2.bussines.abstracts.LanguageService;
import com.mervan.spring_giris_odev2.cores.concretes.Validation;
import com.mervan.spring_giris_odev2.data_access.abstracts.ILanguageRepository;
import com.mervan.spring_giris_odev2.dtos.request.RequestLanguage;

import com.mervan.spring_giris_odev2.dtos.response.ResponseLanguage;
import com.mervan.spring_giris_odev2.entity.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageManager implements LanguageService {

    private ILanguageRepository iLanguageRepository;
    @Autowired
    public LanguageManager(ILanguageRepository iLanguageRepository){
        this.iLanguageRepository=iLanguageRepository;
    }




@Override
     public Language ExistLanguageById(int id) throws Exception {

         if(id<=0){
             throw  new IllegalArgumentException(" illeagel id value");
         }
         Optional<Language> language=iLanguageRepository.findById(id);
         if(language.isPresent()){
             return language.get();
         }
         else{
            throw new NullPointerException("Böyle bir ıd yok");
         }
     }







    private  boolean isNameNotExist(RequestLanguage language) throws Exception {

                   if(Validation.isValid(language)){
                      Language lang=iLanguageRepository.findLanguageByName(language.getName());

                       if(lang!=null){
                           throw   new Exception("Name is already exist");
                       }
                       return true;
                   }
                  return false;

    }

    @Override
    public void add(RequestLanguage language) throws Exception{
        Language lang=new Language();

            if(Validation.isValid(language)){
                lang.setName(language.getName());
                iLanguageRepository.save(lang);

            }

    }

    @Override
    public List<ResponseLanguage> getAll() {
        List<ResponseLanguage> languages= iLanguageRepository.findAllLanguage();

        return languages;
    }

    @Override
    public void update(RequestLanguage language, int id) throws Exception{

            if(Validation.isValid(language)){

                Language lang=ExistLanguageById(id);
                lang.setName(language.getName());
                iLanguageRepository.save(lang);

            }



    }

    @Override
    public void delete(int id) throws Exception{

             Language language =ExistLanguageById(id);
             iLanguageRepository.delete(language);

    }



    @Override
    public ResponseLanguage findResponseLanguageById(int id) throws Exception {
         ResponseLanguage language =iLanguageRepository.findResponseLanguageById(id);
         if(language==null){
             throw new NullPointerException();
         }

        return language;
    }
}
