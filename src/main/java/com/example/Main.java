package com.example;

import com.example.Entidad.Contacto;
import com.example.Entidad.Gastos;
import com.example.Entidad.Ingresos;
import com.example.Entidad.InicioSesion;
import com.example.Entidad.Registro;
import com.example.Entidad.Saldo;
import com.example.Entidad.TipoPersona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Ingresos ingreso = new Ingresos();
        ingreso.setFechaRegistro("18-11-2024");
        ingreso.setIngresoMensual( 5000000);

        em.persist(ingreso);
                
        TipoPersona tipoPersona1 = new TipoPersona();
        tipoPersona1.setPersona("Natural");

        TipoPersona tipoPersona2 = new TipoPersona();
        tipoPersona2.setPersona("Juridica");

        em.persist(tipoPersona1);
        em.persist(tipoPersona2);

        InicioSesion inicioSesion = new InicioSesion();

        inicioSesion.setNombreUsuario("Juancho");
        inicioSesion.setContrasena("juanchoelcapo");

        em.persist(inicioSesion);

        Contacto contacto = new Contacto();
        contacto.setNombre("Kevin");
        contacto.setApellido("Olivella");
        contacto.setEmail("kolivella@cesde.net");
        contacto.setComentario("Pongo una queja de que Juancho me debe plata");
        contacto.setRegistroId(1);
        
        
        em.persist(contacto);

        Registro registro1 = new Registro();
        registro1.setNombre("Jhon Jairo");
        registro1.setApellido("Devia");
        registro1.setRazonSocial(null);
        registro1.setNit(0);
        registro1.setEmail("jj@cesde.net");
        registro1.setTelefono(60457689);
        registro1.setContraseña("jjelbizarro");

        Registro registro2 = new Registro();
        registro2.setNombre(null);
        registro2.setApellido(null);
        registro2.setRazonSocial("Cesde");
        registro2.setNit(900890765);
        registro2.setEmail("Cesde@cesde.net");
        registro2.setTelefono(6049909);
        registro2.setContraseña("pancracio");
        
       em.persist(registro1);
       em.persist(registro2);

        em.getTransaction().commit();

        em.close();
        emf.close();
        
    }
    
}
