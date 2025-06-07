package com.projeto.dao.conta;

import com.projeto.models.conta.Conta;

public interface ContaDao {

    void salvarConta(Conta conta);

    Conta buscarContaPorNumero(String numero);

}
