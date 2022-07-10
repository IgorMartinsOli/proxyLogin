/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxylogin;

/**
 *
 * @author igor_
 */
public abstract class ILogin {
    static int auxId;
    public int id;
    public String name;
    public String senha;
    
    public abstract void logar();
    public abstract void deslogar();
}
