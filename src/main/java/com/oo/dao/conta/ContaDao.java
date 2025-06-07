package com.oo.dao.conta;

import com.oo.models.conta.Conta;

public interface ContaDao {

    void salvarConta(Conta conta);

    Conta buscarContaPorNumero(String numero);

}
