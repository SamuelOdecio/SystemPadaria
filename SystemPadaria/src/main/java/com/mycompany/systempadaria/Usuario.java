/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systempadaria;

/**
 *
 * @author Samuel
 */
public class Usuario {
     private String login;
     private String senha;
    
    // Construtor
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    
    
    // GET SET LOGIN
    public String getLogin(){
        return login;
    }
    
    public void setLogin(String Login){
        this.login = login;
    }
    
    // GET SET SENHA
    public String getSenha(){
        return login;
    }
    
    public void setSenha(String Senha){
        this.senha = Senha;
    }
    

}
