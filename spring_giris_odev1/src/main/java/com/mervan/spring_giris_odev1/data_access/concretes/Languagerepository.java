package com.mervan.spring_giris_odev1.data_access.concretes;

import com.mervan.spring_giris_odev1.data_access.abstracts.ILanguageRepository;
import com.mervan.spring_giris_odev1.entity.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class Languagerepository implements ILanguageRepository {

    private List<Language> languageslist;

    public Languagerepository(){
        languageslist=new ArrayList<Language>() ;

    }


    @Override
    public void add(Language language) {
        languageslist.add(language);
    }

    @Override
    public List<Language> getAll() {
        return languageslist;
    }

    @Override
    public void put(Language language,int index) {
       /* int a=languageslist.indexOf(language);
        if(a>=0){
            languageslist.set(a,language);
        }
        else{
            throw  new NullPointerException(" güncellenecek dil bulunamadı");
        }*/

        languageslist.set(index,language);
    }

    @Override
    public void delete(int id) {
       languageslist.remove(id);

    }

    @Override
    public void delete(Language language) {
      languageslist.remove(language);
    }

    @Override
    public Language findById(int id) {

       Optional<Language> language= languageslist.stream().filter(a->a.getId()==id).findAny();
       return language.orElse(null);

    }
}
