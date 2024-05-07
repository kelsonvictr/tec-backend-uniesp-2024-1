package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Financeiro;
import br.com.alunoonline.api.repository.FinanceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceiroService {

    @Autowired
    FinanceiroRepository financeiroRepository;

    public void create(Financeiro financeiro) {
        financeiroRepository.save(financeiro);
    }
}
