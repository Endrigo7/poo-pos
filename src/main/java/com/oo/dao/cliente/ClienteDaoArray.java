package com.oo.dao.cliente;

import com.oo.models.cliente.Cliente;

public class ClienteDaoArray implements ClienteDao {
    private static final ClienteDaoArray INSTANCIA = new ClienteDaoArray();
    private static final int NUMERO_MAXIMO_DE_CLIENTES = 1;
    private static final Cliente[] clientes = new Cliente[NUMERO_MAXIMO_DE_CLIENTES];
    private static int indice = 0;

    private ClienteDaoArray(){
    }

    public static ClienteDaoArray getInstance() {
        return INSTANCIA;
    }

    @Override
    public void salvarCliente(Cliente cliente) {
        if(indice >= NUMERO_MAXIMO_DE_CLIENTES) {
            System.out.println("Não é possível criar mais clientes. Numero máximo antigido!!");
            return;
        }

        clientes[indice] = cliente;
        indice++;

    }

    @Override
    public Cliente buscarContaPorCPF(String cpf) {
        for (int i = 0; i < NUMERO_MAXIMO_DE_CLIENTES; i++) {
            if (cpf.equals(clientes[i].getCpf())) {
                return clientes[i];
            }
        }

        return null;
    }
}
