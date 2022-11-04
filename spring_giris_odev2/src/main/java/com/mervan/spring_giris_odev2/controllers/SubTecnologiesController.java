package com.mervan.spring_giris_odev2.controllers;

import com.mervan.spring_giris_odev2.bussines.abstracts.TecnologyService;
import com.mervan.spring_giris_odev2.dtos.request.RequestLanguage;
import com.mervan.spring_giris_odev2.dtos.request.RequestTecnology;
import com.mervan.spring_giris_odev2.dtos.response.ResponseLanguage;
import com.mervan.spring_giris_odev2.dtos.response.ResponseTecnology;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subTecnologies")
@RequiredArgsConstructor
public class SubTecnologiesController {
    private TecnologyService tecnologyService;
    @Autowired
    public SubTecnologiesController(TecnologyService tecnologyService) {
        this.tecnologyService = tecnologyService;
    }
    @GetMapping(value = "getall")
    public List<ResponseTecnology> getAll(){
        return tecnologyService.getAll();
    }
    @PostMapping(value="/add")
    public void add(@RequestBody RequestTecnology tecnology){
        try {
            tecnologyService.add(tecnology);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PutMapping(value = "/put/{id}")
    public void  put(@RequestBody RequestTecnology tecnology, @RequestParam int id) {
        try {
            tecnologyService.update(tecnology,id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping(value = "/getby/{id}")
    public ResponseTecnology findById(@PathVariable int id){


        try {
            return tecnologyService.findResponseTecnologyById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@RequestParam int id){
        try {
            tecnologyService.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
