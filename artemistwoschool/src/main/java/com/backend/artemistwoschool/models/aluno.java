package main.java.com.backend.artemistwoschool.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name = "aluno")
public class aluno {
    
    @id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @column
    private integer id;

    @column
    private String nome;

    @column
    private LocalDate dataNascimento;

    
    @column
    private String email;


    public aluno() {
    }

    

    public aluno(integer id, String nome, LocalDate dataNascimento, String email) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }



    public integer getId() {
        return id;
    }


    public void setId(integer id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    

}

