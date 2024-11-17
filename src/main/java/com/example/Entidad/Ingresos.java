package com.example.Entidad;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "ingresos")
public class Ingresos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fechaRegistro")
    private String fechaDeRegistro;

    @Column(name = "ingresoMensual")
    private int ingresoMensual;

    //Getters y Setters
public Long getId() {
    return id;
}

public void setId(Long id){
    this.id = id;
}

public String getFechaRegistro() {
    return fechaDeRegistro;
}

public void setFechaRegistro(String fechaDeRegistro){
    this.fechaDeRegistro = fechaDeRegistro;
}
public int getIngresoMensual() {
    return ingresoMensual;
}

public void setIngresoMensual(int ingresoMensual){
    this.ingresoMensual = ingresoMensual;
}

}
