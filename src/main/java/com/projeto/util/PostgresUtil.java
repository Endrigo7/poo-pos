package com.projeto.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgresUtil {

    public static Connection getConnection() {
        try {
            Class dbDriver = Class.forName("org.postgresql.Driver");
            String jdbcURL = "jdbc:postgresql://127.0.0.1:5432/poo_pos?ssl=false";
            return DriverManager.getConnection(jdbcURL, "seu_usuario_de_banco", "senha_do_seu_usuario_de_banco");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao obter conexao com bacno de dados");
        }
    }
}
