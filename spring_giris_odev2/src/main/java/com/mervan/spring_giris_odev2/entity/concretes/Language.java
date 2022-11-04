package com.mervan.spring_giris_odev2.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"name","id"})
@Entity
@Table(name = "languages")
public class Language {
     @SequenceGenerator(name="languageId",sequenceName = "seq_language_id",allocationSize = 1)

     @Id
     @GeneratedValue(generator = "languageId",strategy = GenerationType.SEQUENCE)
    private int id;
     @Column(name="language_name",length = 150,nullable = false,unique = true)
    private String name;
     @OneToMany(mappedBy = "language",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
     @JsonIgnore
     private Set<SubTecnology> subTecnologySet;


}
