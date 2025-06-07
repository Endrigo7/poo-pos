package com.estudos.exericios.oo.exercicio12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa extends Object {

    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome) {
        this.nome = nome;
    }

}
