package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public int numero;
    public Cliente cliente;
    public double total;
    public List<Produto> produtos = new ArrayList<>();

    public void mostrarPedido(){
        System.out.println("---------------------------");
        System.out.println("PEDIDO Nº " + numero);
        System.out.println("---------------------------");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Telefone: " + cliente.tel);
        System.out.println("E-mail: " + cliente.email);
        System.out.println("---------------------------");
        System.out.println("ITENS DO PEDIDO");
        System.out.println("---------------------------");
        for(Produto p : produtos){
            System.out.println("---" + p.desc);
        }
        System.out.println("---------------------------");
        System.out.println("TOTAL: R$ " + total);
    }

}
