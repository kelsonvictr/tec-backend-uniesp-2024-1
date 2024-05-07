package br.com.alunoonline.api.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class HistoricoAlunoResponse {
    private String nomeAluno;
    private String emailAluno;
    private List<DisciplinasAlunoResponse> disciplinasAlunoResponseList;
}
