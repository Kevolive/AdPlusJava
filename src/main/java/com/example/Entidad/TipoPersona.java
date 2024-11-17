package com.example.Entidad;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;


@Entity
@Table(name = "tipo_persona")
public class TipoPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "persona")
    private String persona;

     //Getters y Setters
public Long getId() {
    return id;
}

public void setId(Long id){
    this.id = id;
}

public String getPersona() {
    return persona;
}

public void setPersona(String persona){
    this.persona = persona;
}
  
}
