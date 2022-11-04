package com.mervan.spring_giris_odev2.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"teknologyName","id"})
@Entity
@Table(name = "subtecnologies")
public class SubTecnology {
    @SequenceGenerator(name="tecnologyId",sequenceName = "seq_tecnology_id",allocationSize = 1)

    @Id
    @GeneratedValue(generator = "tecnologyId",strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "tecnology_name",unique = true)
    private String tecnologyName;
    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Language.class)
    @JoinColumn(name = "language_id")
    @JsonIgnore
    private Language language;
}
