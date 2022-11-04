package com.mervan.spring_giris_odev2.data_access.abstracts;

import com.mervan.spring_giris_odev2.dtos.response.ResponseTecnology;
import com.mervan.spring_giris_odev2.entity.concretes.SubTecnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ITecnologyRepository  extends JpaRepository<SubTecnology,Integer> {
    @Query("select new com.mervan.spring_giris_odev2.dtos.response.ResponseTecnology(sub.id,sub.tecnologyName,sub.language) from SubTecnology as sub")
    public List<ResponseTecnology> findAllResponseTecnology();
    @Query("select new com.mervan.spring_giris_odev2.dtos.response.ResponseTecnology(sub.id,sub.tecnologyName,sub.language) from SubTecnology as sub where  " +
            "sub.id=:id")
    public ResponseTecnology findResponseTecnologyById(int id);
}
