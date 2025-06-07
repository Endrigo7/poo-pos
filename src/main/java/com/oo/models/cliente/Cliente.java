package com.oo.models.cliente;

import com.oo.models.conta.Conta;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Cliente {
    private String cpf;
    private String nome;
    private List<Conta> contas;

    public Cliente(String cpf, String nome, List<Conta> contas) {
        setCpf(cpf);
        setNome(nome);
        setContas(contas);
    }

    public void setCpf(String novoCpf){
        if (novoCpf == null || novoCpf.length() != 14 || !digitoVerificadorValido(novoCpf)) {
            System.out.println("Seu CPF " + novoCpf + " não é valido!!! Por favor, infome um cpf valido!!!");
        }

        cpf = novoCpf;
    }

    public void setNome(String nome) {
        if (nome == null || nome.length() < 3) {
            System.out.println("Seu nome " + nome + " não é valido!!! Por favor, infome um nome valido!!!");
        }

        this.nome = nome;
    }


    private Boolean digitoVerificadorValido(String cpf) {
        return cpf.startsWith("11", 12);
    }
}
