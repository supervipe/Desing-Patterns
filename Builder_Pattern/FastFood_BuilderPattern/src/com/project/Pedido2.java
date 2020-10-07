package com.project;

public class Pedido2 implements Pedido {

    private String itemPrincipal;
    private String itemSecundario;
    private String bebida;
    private String brinquedo;

    public Pedido2(String itemPrincipal, String itemSecundario, String bebida, String brinquedo) {
        this.itemPrincipal = itemPrincipal;
        this.itemSecundario = itemSecundario;
        this.bebida = bebida;
        this.brinquedo = brinquedo;
    }

    @Override
    public String getItemPrincipal() {
        return null;
    }

    @Override
    public String getItemSecundario() {
        return null;
    }

    @Override
    public String getBebida() {
        return null;
    }

    @Override
    public String getBrinquedo() {
        return null;
    }
}
