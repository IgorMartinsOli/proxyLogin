/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxylogin;

/**
 *
 * @author igor_
 */
public class UserProxy extends ILogin{
    protected User user;
    
    UserProxy(User user){
        this.user = user;
    }

    @Override
    public void logar() {
        System.out.println("Vamos logar com proxy");
        this.user.logar();
    }

    @Override
    public void deslogar() {
        System.out.println("Vamos deslogar com proxy");
        this.user.deslogar();
    }
}
