/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxylogin;

/**
 *
 * @author igor_
 */
public class User extends ILogin{

    public User(String name, String senha){
        id = ILogin.auxId;
        ILogin.auxId++;
        this.name = name;
        this.senha = senha;
    }
    @Override
    public void logar() {
        System.out.println(this.name + " logado");
    }

    @Override
    public void deslogar() {
        System.out.println(this.name + " Deslogado");
    }
    
}
