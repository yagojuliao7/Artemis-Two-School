package com.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.artemistwoschool.models.Aluno;
import com.backend.services.AlunoService;

@RestController
@RequestMapping
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;
    
    @GetMapping("/contar-alunos")
    public Long contarAlunos(){
        return alunoService.contarAlunos();
    }

    @GetMapping("/buscar-alunos")
    public Aluno contarAlunos(@PathVariable Integer id){
        return alunoService.buscarAlunos(id);
    }

    @GetMapping("/Listar-Alunos")
    public List<Aluno> listarAlunos(){
        return alunoService.listarAlunos();
    }

    @DeleteMapping("/deletar-Alunos")
    public String deleteAluno(@PathVariable Integer id){
        if (alunoService.deletarAlunos(id)) {
            return "Aluno deletado com sucesso";
        }
        return "Falha ao deletar o aluno";
    }

    @PostMapping("/salvar-aluno")
    public Aluno cadastrarAluno(@RequestBody Aluno aluno){
        return alunoService.cadastrarAlunos(aluno);
    }

    @PostMapping("/atualizar-aluno/{id}")
    public String atualizarAluno(@PathVariable Integer id,@RequestBody Aluno aluno){

        if (alunoService.atualizarAlunos(id, aluno) != null) {
            return "Aluno atualizado com sucesso";
        }
        return "Falha ao atualizar o aluno";
    }
}
