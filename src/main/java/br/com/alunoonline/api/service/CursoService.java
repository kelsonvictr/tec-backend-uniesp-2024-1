package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Curso;
import br.com.alunoonline.api.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    CursoRepository cursoRepository;

    public void create(Curso curso) {
        cursoRepository.save(curso);
    }
}
