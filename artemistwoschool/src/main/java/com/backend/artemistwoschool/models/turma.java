package main.java.com.backend.artemistwoschool.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class turma {
   
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String nome;

    @OneToMany
    @JoionColumn(name = "id_turma")
    private List<alunos> alunos;

    public turma() {
    }

    

    public turma(Integer id, String nome, List<main.java.com.backend.artemistwoschool.models.alunos> alunos) {
        this.id = id;
        this.nome = nome;
        this.alunos = alunos;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List getAlunos() {
        return alunos;
    }

    public void setAlunos(List alunos) {
        this.alunos = alunos;
    }

    
    

}
