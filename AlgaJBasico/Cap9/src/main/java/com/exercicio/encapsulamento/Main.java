package com.exercicio.encapsulamento;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.setCodigo(12);
        pedido.setDesconto(5);
        pedido.setTotal(21);
        pedido.setSubtotal(3);

        System.out.println("Código: " + pedido.getCodigo());
        System.out.println("Constante: " + pedido.quantidadeMinima);
    }
}
