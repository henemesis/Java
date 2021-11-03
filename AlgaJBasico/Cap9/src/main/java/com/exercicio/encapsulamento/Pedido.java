package com.exercicio.encapsulamento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pedido {

    static Integer quantidadeMinima = 2;
    private Integer codigo;
    private Integer subtotal;
    private Integer desconto;
    private Integer total;
}
