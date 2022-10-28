package com.mervan.spring_giris_odev1.api.controllers;

import com.mervan.spring_giris_odev1.bussines.abstracts.LanguageService;
import com.mervan.spring_giris_odev1.entity.concretes.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/api/languages")
@RequiredArgsConstructor
public class LanguagesController {
    @Autowired
    private LanguageService languageService;
    @PostConstruct
    public void init(){
        languageService.add(new Language(1,"Java"));
        languageService.add(new Language(2,"C"));
        languageService.add(new Language(3,"Python"));
    }
    @GetMapping(value = "getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }
    @PostMapping(value="/add")
    public void add(@RequestBody Language language){
        languageService.add(language);
    }
    @PutMapping(value = "/put")
    public void  put(@RequestBody Language language) {
        languageService.put(language);
    }
    @GetMapping(value = "/getby/{id}")
    public Language findById(@PathVariable int id){
        return languageService.findById(id);
    }
    @DeleteMapping(value = "/delete")
    public void delete(@RequestBody Language language){
        languageService.delete(language);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable int id){
        languageService.delete(id);
    }


}
