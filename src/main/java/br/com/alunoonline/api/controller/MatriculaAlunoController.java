package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.dtos.AtualizarNotasRequest;
import br.com.alunoonline.api.dtos.HistoricoAlunoResponse;
import br.com.alunoonline.api.model.MatriculaAluno;
import br.com.alunoonline.api.service.MatriculaAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matricula-aluno")
public class MatriculaAlunoController {

    @Autowired
    MatriculaAlunoService matriculaAlunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody MatriculaAluno matriculaAluno) {
        matriculaAlunoService.create(matriculaAluno);
    }

    @PatchMapping("/update-grades/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizaNotas(@RequestBody AtualizarNotasRequest atualizarNotasRequestDto,
                              @PathVariable Long id) {
        matriculaAlunoService.updateGrades(atualizarNotasRequestDto, id);
    }

    @PatchMapping("/update-status-to-break/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizaStatus(@PathVariable Long id) {
        matriculaAlunoService.updateStatusToBreak(id);
    }

    @GetMapping("/academic-transcript/{alunoId}")
    @ResponseStatus(HttpStatus.OK)
    public HistoricoAlunoResponse getHistoricoDoAluno(@PathVariable Long alunoId) {
        return matriculaAlunoService.getHistoricoFromAluno(alunoId);
    }
}
