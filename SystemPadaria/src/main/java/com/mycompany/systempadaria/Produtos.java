/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.systempadaria;

/**
 *
 * @author Samuel
 */
public class Produtos {
    private String nome;
    private int codigo;
    private int quantidade;
    private double valor;
    
    public Produtos(String nome, int codigo, int quantidade, double valor){
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valor = valor;
    
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
