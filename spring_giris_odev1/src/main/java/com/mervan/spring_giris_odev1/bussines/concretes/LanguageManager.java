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



        try{
            isExistId(language.getId());
            boolean diffObj= isNameExist(language);
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


         try{

                 boolean diffObj = isNameExist(language);
                 if (diffObj == true) {
                      int index=getIndex(language);
                     iLanguageRepository.put(language,index);
                 }

         }
         catch(Exception ex){
             System.err.println(ex.getMessage());
         }
     }
     private void isExistId(int id) throws Exception {
         List<Language> list=getAll();
         if(id<=0){
             throw  new IllegalArgumentException(" illeagel id value");
         }
        boolean exist= list.stream().anyMatch(a->a.getId()==id);
        if(exist){
            throw  new Exception("Id already exist");
        }
     }
   private int getIndex(Language language){
       List<Language> list=getAll();
       if(language==null){
           throw new NullPointerException("language null olamaz");
       }
       Optional<Language> lan=list.stream().filter(a->a.getId()==language.getId()).findAny();
       int index=list.indexOf(lan.get());
       return index;
   }
    private int getIndex(int id){
        List<Language> list=getAll();
        Optional<Language> lan=list.stream().filter(a->a.getId()==id).findAny();
        int index=list.indexOf(lan.get());
        if(index<0){
            throw new ArrayIndexOutOfBoundsException("-1 index of bounds");

        }
        return index;
    }

    @Override
    public void delete(int id) {
      int index=getIndex(id);
          if(index>-1){
              iLanguageRepository.delete(index);
          }
          else{
              throw  new ArrayIndexOutOfBoundsException("-d böyle bir id yok");
          }



    }

    @Override
    public void delete(Language language) {
       try {
            int index=getIndex(language);
            if(index>-1){
                iLanguageRepository.delete(language);
            }

        }
       catch (Exception ex){
           System.err.println(ex.getMessage());
       }


    }

    @Override
    public Language findById(int id){
        try {
            if( getIndex(id)>0){
                return iLanguageRepository.findById(id);
            }
        }
        catch (Exception ex){
            System.err.println(ex.getMessage());
        }
           return  null;



    }

    private  boolean isNameExist(Language language) throws Exception {


                   boolean exist=this.getAll().stream().anyMatch(a->{
                       return a.getName().toLowerCase().equals(language.getName().toLowerCase() );
                   });

                   if(exist){
                      throw   new Exception("Name is already exist");
                   }
                   return true;




       /* if(Validation.isValid(language)==true){
            boolean eq=this.getAll().stream().anyMatch(a->{
               return a.getName().toLowerCase().equals(language.getName().toLowerCase() );
            });

            if(eq==false){
                return true;
            }
            else{
                throw  new IllegalArgumentException("Name parametresi  zaten mevcut");
            }
        }*/


    }
}
