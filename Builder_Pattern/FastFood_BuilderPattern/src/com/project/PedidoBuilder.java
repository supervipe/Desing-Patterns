package com.project;

public interface PedidoBuilder {


    void buildItemPrincipal(String itemPrincipal);
    void buildItemSecundario(String itemSecundario);
    void buildBebida(String bebida);
    void buildBrinquedo(String brinquedo);

    Pedido getPedido();
}
