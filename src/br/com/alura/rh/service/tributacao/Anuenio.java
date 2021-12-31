package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste {
  
  BigDecimal valor;
  LocalDate data;

  public Anuenio(BigDecimal valor) {
    this.valor = valor;
    this.data = LocalDate.now();
  }

  @Override
  public BigDecimal valor() {
    return valor;
  }

  @Override
  public LocalDate data() {
    return data;
  }
}
