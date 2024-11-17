package com.example.Entidad;
import javax.persistence.*;

@Entity
@Table(name = "inicioSesion")
public class InicioSesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(name = "nombreUsuario")
private String nombreDeUsuario;

@Column(name = "contrasena")
private String contrasena;

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getNombreUsuario() {
return nombreDeUsuario;
}

public void setNombreUsuario(String nombreDeUsuario) {
this.nombreDeUsuario = nombreDeUsuario;
}

public String getContrasena() { 
return contrasena;
}

public void setContrasena(String contrasena) {
this.contrasena = contrasena;
}
}
