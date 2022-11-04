package com.mervan.spring_giris_odev2.controllers;


import com.mervan.spring_giris_odev2.bussines.abstracts.LanguageService;

import com.mervan.spring_giris_odev2.dtos.request.RequestLanguage;
import com.mervan.spring_giris_odev2.dtos.response.ResponseLanguage;
import com.mervan.spring_giris_odev2.entity.concretes.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/languages")
@RequiredArgsConstructor
public class LanguagesController {
    @Autowired
    private LanguageService languageService;

    @GetMapping(value = "getall")
    public List<ResponseLanguage> getAll(){
        return languageService.getAll();
    }
    @PostMapping(value="/add")
    public void add(@RequestBody RequestLanguage language){
        try {
            languageService.add(language);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PutMapping(value = "/put/{id}")
    public void  put(@RequestBody RequestLanguage language, @RequestParam int id) {
        try {
            languageService.update(language,id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping(value = "/getby/{id}")
    public ResponseLanguage findById(@PathVariable int id){


        try {
            return languageService.findResponseLanguageById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@RequestParam int id){
        try {
            languageService.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
