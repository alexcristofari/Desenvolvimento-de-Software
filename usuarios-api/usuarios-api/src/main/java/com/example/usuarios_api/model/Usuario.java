package com.example.usuarios_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private int idade;
    private String genero;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}
