package com.project;

public class GerarPedido {

    private PedidoBuilder pedidoBuilder;

    public GerarPedido(PedidoBuilder pedidoBuilder) {
        this.pedidoBuilder = pedidoBuilder;
    }
    public Pedido gerarPedido() {
        this.pedidoBuilder.buildItemPrincipal("Hamburger");
        this.pedidoBuilder.buildItemSecundario("Batata frita");
        this.pedidoBuilder.buildBebida("Guarana");
        this.pedidoBuilder.buildBrinquedo("Boneco Policial");

        Pedido pedido = pedidoBuilder.getPedido();
        return pedido;
    }
}
