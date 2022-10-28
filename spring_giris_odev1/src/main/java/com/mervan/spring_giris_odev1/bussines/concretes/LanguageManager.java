package com.mervan.spring_giris_odev1.bussines.concretes;

import com.mervan.spring_giris_odev1.bussines.abstracts.LanguageService;
import com.mervan.spring_giris_odev1.cores.concretes.Validation;
import com.mervan.spring_giris_odev1.data_access.abstracts.ILanguageRepository;
import com.mervan.spring_giris_odev1.entity.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.ldap.LdapName;
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
    public void add(Language language) {
        int id=0;
        if(getAll().size()>0){
            id=getAll().get(getAll().size()-1).getId();
        }

        language.setId(++id);
        try{
            boolean diffObj= isDifferentObject(language);
            if(diffObj==true){
               iLanguageRepository.add(language);
            }
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
        }



    }

    @Override
    public List<Language> getAll() {
        return iLanguageRepository.getAll();
    }

    @Override
    public void put(Language language) {
     List<Language> list=getAll();

         try{
             if(list.stream().anyMatch(a->a.getId()==language.getId())) {
                 boolean diffObj = isDifferentObject(language);
                 if (diffObj == true) {
                      int index=getIndex(language);
                     iLanguageRepository.put(language,index);
                 }
             }
         }
         catch(Exception ex){
             System.err.println(ex.getMessage());
         }
     }
   private int getIndex(Language language){
       List<Language> list=getAll();
       Optional<Language> lan=list.stream().filter(a->a.getId()==language.getId()).findAny();
       int index=list.indexOf(lan.get());
       return index;
   }
    private int getIndex(int id){
        List<Language> list=getAll();
        Optional<Language> lan=list.stream().filter(a->a.getId()==id).findAny();
        int index=list.indexOf(lan.get());
        return index;
    }

    @Override
    public void delete(int id) {
      if(id>0){
          if(getIndex(id)>-1){
              iLanguageRepository.delete(getIndex(id));
          }
          else{
              throw  new ArrayIndexOutOfBoundsException("-d böyle bir id yok");
          }
      }
      else{
          throw new IllegalArgumentException("id değeri negatif ve sıfır olamaz");
      }

    }

    @Override
    public void delete(Language language) {
        if(language!=null){
            if(getIndex(language)>-1){
                iLanguageRepository.delete(language);
            }
            else{
                throw  new ArrayIndexOutOfBoundsException("-1 , böyle bir language  yok");
            }
        }
        else{
            throw new NullPointerException("language değri null olamaz");
        }

    }

    @Override
    public Language findById(int id) {
        if(id>0){
            if( iLanguageRepository.findById(id)!=null){
                return iLanguageRepository.findById(id);
            }
            else{
                throw new NullPointerException("language değri null olamaz");
            }
        }
        else{
            throw  new IllegalArgumentException("id parametresi negatif veya 0 olamaz");
        }
    }

    private  boolean isDifferentObject(Language language){


        if(Validation.isValid(language)==true){
            boolean eq=this.getAll().stream().anyMatch(a->{
               return a.getName().toLowerCase().equals(language.getName().toLowerCase() )&& a.getId()!=language.getId();
            });

            if(eq==false){
                return true;
            }
            else{
                throw  new IllegalArgumentException("Name parametresi  zaten mevcut");
            }
        }
        return false;

    }
}
