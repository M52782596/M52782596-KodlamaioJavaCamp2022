package com.mervan.spring_giris_odev2.cores.concretes;


import com.mervan.spring_giris_odev2.dtos.request.RequestLanguage;




public enum Validation {
    ;


   public static boolean isValid(RequestLanguage language){
       if(language==null){
          throw new NullPointerException("Null değer atanamaz");
       }
       if(language.getName().isEmpty()){
           return false;
       }

       return true;
   }

}
