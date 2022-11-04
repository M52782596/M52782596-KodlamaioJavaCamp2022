package com.mervan.spring_giris_odev2.bussines.concretes;

import com.mervan.spring_giris_odev2.bussines.abstracts.LanguageService;
import com.mervan.spring_giris_odev2.bussines.abstracts.TecnologyService;
import com.mervan.spring_giris_odev2.data_access.abstracts.ITecnologyRepository;
import com.mervan.spring_giris_odev2.dtos.request.RequestTecnology;
import com.mervan.spring_giris_odev2.dtos.response.ResponseTecnology;
import com.mervan.spring_giris_odev2.entity.concretes.Language;
import com.mervan.spring_giris_odev2.entity.concretes.SubTecnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnologyManager implements TecnologyService {

    private ITecnologyRepository iTecnologyRepository;
    private LanguageService languageService;
@Autowired
   public TecnologyManager(ITecnologyRepository iTecnologyRepository,LanguageService languageService){
       this.iTecnologyRepository   =iTecnologyRepository;
       this.languageService=languageService;
   }

    @Override
    public void add(RequestTecnology tecnology) throws Exception{
        SubTecnology subTecnology=new SubTecnology();



            if(!tecnology.getName().isEmpty()){
                Language language=languageService.ExistLanguageById(tecnology.getLanguade_id());
                subTecnology.setTecnologyName(tecnology.getName());
                subTecnology.setLanguage(language);
                iTecnologyRepository.save(subTecnology);
            }



    }


    @Override
    public List<ResponseTecnology> getAll() {
   List<ResponseTecnology>res=iTecnologyRepository.findAllResponseTecnology();

        return res;
    }

    @Override
    public void update(RequestTecnology tecnology, int id) throws Exception {

       if(id<=0){
           throw new IllegalArgumentException("id değeri 0 veya eksi değer olamaz");
       }
      if(isValid(tecnology)){
          Language language=languageService.ExistLanguageById(tecnology.getLanguade_id());
         SubTecnology subTecnology=ExistTecnologyById(id);
         subTecnology.setTecnologyName(tecnology.getName());
         subTecnology.setLanguage(language);
         iTecnologyRepository.save(subTecnology);



      }
    }
     public boolean isValid(RequestTecnology tecnology) throws Exception {
         if(tecnology==null){
             throw new NullPointerException("null referans");
         }
         if(tecnology.getName().isEmpty()){
             throw new Exception("isim alanı boş olamaz");
         }
         if(tecnology.getLanguade_id()<=0){
             throw new IllegalArgumentException("language id eksi değer yada sıfır olamaz");
         }
         return true;
     }
    @Override
    public void delete(int id) throws Exception {
          SubTecnology subTecnology =ExistTecnologyById(id);
           iTecnologyRepository.delete(subTecnology);
    }

    @Override
    public ResponseTecnology findResponseTecnologyById(int id) throws Exception {
         if(id<=0){
             throw  new IllegalArgumentException();
         }
         ResponseTecnology responseTecnology =iTecnologyRepository.findResponseTecnologyById(id);
         if(responseTecnology==null){
             throw  new NullPointerException();
         }
         return  responseTecnology;
    }

    @Override
    public SubTecnology ExistTecnologyById(int id) throws Exception {
        Optional<SubTecnology> subTecnology =iTecnologyRepository.findById(id);
        if(!subTecnology.isPresent()){
          throw  new NullPointerException();
        }
        return subTecnology.get();
    }
}
