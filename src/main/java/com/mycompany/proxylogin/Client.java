/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proxylogin;

/**
 *
 * @author igor_
 */
public class Client {
    public static void main(String[] args) {
        User user = new User("Igor", "123");
        user.logar();
        user.deslogar();
        System.out.println(user.id);
        
        UserProxy proxy = new UserProxy(user);
        proxy.logar();
        proxy.deslogar();
    }
    
}
