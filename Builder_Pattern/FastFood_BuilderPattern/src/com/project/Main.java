package com.project;

public class Main {

    public static void main(String[] args) {

        PedidoBuilder pedidoBuilder = new Pedido1Builder();
        GerarPedido gerarPedido = new GerarPedido(pedidoBuilder);
        Pedido pedido = gerarPedido.gerarPedido();
    }
}
