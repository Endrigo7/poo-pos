package com.projeto.dao.cliente;

import com.projeto.models.cliente.Cliente;

public interface ClienteDao {

    void salvarCliente(Cliente cliente);

    Cliente buscarContaPorCPF(String cpf);

}
