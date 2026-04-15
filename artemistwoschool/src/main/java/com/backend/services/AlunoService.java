package com.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.artemistwoschool.models.Aluno;
import com.backend.artemistwoschool.repositories.AlunoRepository;

import main.java.com.backend.artemistwoschool.models.alunos;


@Service
public class AlunoService {
    

    @Autowired
    private AlunoRepository alunoRepository;

    public Long contarAlunos(){
        return alunoRepository.count();
    }

    public Aluno buscarAlunos(Integer id){

        return alunoRepository.findById(id).get();

    }

    public List<Aluno> listarAlunos(){
        return alunoRepository.findAll();

    }

    public Boolean deletarAlunos(Integer id){

        if (alunoRepository.existsById(id)){
            alunoRepository.deleteById(id);
            return true;

        }
        return false;
    }

    public Aluno cadastrarAlunos(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Aluno atualizarAlunos(Integer id, Aluno aluno){

        Aluno alunosRecuperados = buscarAlunos(id);
        if (alunosRecuperados != null) {
            alunosRecuperados.setId(id);
            if (aluno.getNome() != null) {
                alunosRecuperados.setNome(aluno.getNome());  
            }
            if (aluno.getDataNascimento() != null) {
                alunosRecuperados.setDataNascimento(aluno.getDataNascimento());  
            }
            return alunosRecuperados.save(alunosRecuperados);  
        }
        return null;
    }

}