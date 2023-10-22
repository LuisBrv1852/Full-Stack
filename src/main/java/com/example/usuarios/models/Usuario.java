package com.example.usuarios.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuarios")
@ToString   @EqualsAndHashCode
public class Usuario {
//esta clase se usa para representar a la tabla usuarios, por eso se coloca el nombre de cada columna y
// el nombre de la variabe
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id")
    private long id;
    @Getter @Setter @Column(name="nombre")
    private String nombre;
    @Getter @Setter @Column(name="apellido")
    private String apellido;
    @Getter @Setter @Column(name="email")
    private String email;
    @Getter @Setter @Column(name="telefono")
    private String telefono;
    @Getter @Setter @Column(name="password")
    private String password;


}