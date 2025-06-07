package com.projeto.dao.cliente;

import com.projeto.models.cliente.Cliente;
import com.projeto.util.PostgresUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ClienteDaoPostgres implements ClienteDao{
    private static final ClienteDaoPostgres INSTANCIA = new ClienteDaoPostgres();

    private ClienteDaoPostgres(){
    }

    public static ClienteDaoPostgres getInstance() {
        return INSTANCIA;
    }

    @Override
    public void salvarCliente(Cliente cliente) {

    }

    @Override
    public Cliente buscarContaPorCPF(String cpf) {
        Connection connection = PostgresUtil.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from cliente where cpf = '" + cpf + "'");
            while (rs.next()) {
                return new Cliente(rs.getString("cpf"), rs.getString("nome"), null);
            }

        } catch (Exception e) {
            System.out.println("Erro ao execcutar consulta de cliente . Error: " + e.getMessage());
        }

        return null;
    }
}
