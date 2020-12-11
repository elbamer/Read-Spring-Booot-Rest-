package com.disenotuweb.Crud.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    
     private static final long serialVersionUID= 7383224828869021596L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
