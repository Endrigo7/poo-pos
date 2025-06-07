package com.projeto.dao.cliente;

import com.projeto.models.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDaoList implements ClienteDao {

    private static final ClienteDaoList INSTANCIA = new ClienteDaoList();
    private static final List<Cliente> clientes = new ArrayList<>();

    private ClienteDaoList(){
    }

    public static ClienteDaoList getInstance() {
        return INSTANCIA;
    }


    @Override
    public void salvarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Cliente buscarContaPorCPF(String cpf) {
        return clientes
                .stream()
                .filter(cliente -> cliente.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }
}
