package com.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.artemistwoschool.models.Turma;
import com.backend.services.TurmaService;

@RestController
@RequestMapping("/turma")
public class TurmaController {
    
    @Autowired
    private TurmaService turmaService;

    @GetMapping("/contar-turma")
    public Long contarTurma(){
        return turmaService.contarTurma();
    }

    @GetMapping("/buscar-turma/{id}")
    public Turma buscarTurma(@PathVariable Integer id){
        return turmaService.buscarTurma(id);
    }

    @GetMapping("listar-turma")
    public List<Turma> listarTurmas(){
        return turmaService.listarTurmas();
    }

    @DeleteMapping("/deletar-turma/{id}")
    public String deletarTurma(@PathVariable Integer id){
        if (turmaService.deletarTurma(id)) {
            return "Turma excluída com sucesso";
        }
        return "Falha na exclusão da turma";
    }

    @PostMapping("/salvar-turma")
    public Turma cadastrarTurma(@RequestBody Turma turma){
        return turmaService.cadastrarTurma(turma);
    }

    @PutMapping("atualizar-turma/{id}")
    public String atualizarTurma(@PathVariable Integer id, @RequestBody Turma turma){
        if (turmaService.atualizarTurma(id, turma) != null) {
            return "Turma atualizada com sucesso";
        }
        return "Falha na atualização da Turma";
    }


}
