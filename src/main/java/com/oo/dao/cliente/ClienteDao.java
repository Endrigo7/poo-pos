package com.oo.dao.cliente;

import com.oo.models.cliente.Cliente;

public interface ClienteDao {

    void salvarCliente(Cliente cliente);

    Cliente buscarContaPorCPF(String cpf);

}
