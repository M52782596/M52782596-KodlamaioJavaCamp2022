package com.mervan.spring_giris_odev1;

import com.mervan.spring_giris_odev1.bussines.concretes.LanguageManager;
import com.mervan.spring_giris_odev1.data_access.concretes.Languagerepository;
import com.mervan.spring_giris_odev1.entity.concretes.Language;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGirisOdev1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringGirisOdev1Application.class, args);

    }

}
