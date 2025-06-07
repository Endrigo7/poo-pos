package com.oo.models.conta;

import java.math.BigDecimal;

public abstract class ContaComRendimentos extends Conta {

    public abstract BigDecimal renderJuros(BigDecimal taxa);

}
