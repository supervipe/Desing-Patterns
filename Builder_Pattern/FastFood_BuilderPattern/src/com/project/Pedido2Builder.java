package com.project;

public class Pedido2Builder implements PedidoBuilder {
    private String itemPrincipal;
    private String itemSecundario;
    private String bebida;
    private String brinquedo;

    @Override
    public void buildItemPrincipal(String itemPrincipal) {
        this.itemPrincipal = itemPrincipal;
    }

    @Override
    public void buildItemSecundario(String itemSecundario) {
        this.itemSecundario = itemSecundario;
    }

    @Override
    public void buildBebida(String bebida) {
        this.bebida = bebida;
    }

    @Override
    public void buildBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }

    @Override
    public Pedido getPedido() {
        return new Pedido1(itemPrincipal,itemSecundario,bebida,brinquedo);
    }
}
