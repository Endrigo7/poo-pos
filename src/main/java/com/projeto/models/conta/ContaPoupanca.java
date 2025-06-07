package com.projeto.models.conta;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_EVEN;
import static java.time.LocalDate.now;

@Data
@EqualsAndHashCode(callSuper = true)
public class ContaPoupanca extends ContaComRendimentos {

    private static int numeroConta = 1;

    private int diaAniversario;

    public ContaPoupanca() {
        numero = "123";
        setNumero(String.valueOf(numeroConta)); ;
        setSaldo(BigDecimal.ZERO);
        numeroConta++;
    }

    @Override
    public BigDecimal renderJuros(BigDecimal taxa) {
        if (now().getDayOfMonth() == diaAniversario) {
            BigDecimal rendimento = getSaldo()
                    .multiply(taxa.setScale(2, HALF_EVEN));

            setSaldo(getSaldo()
                    .add(rendimento)
                    .setScale(2, HALF_EVEN));

            return getSaldo();
        }

        return getSaldo();
    }
}
