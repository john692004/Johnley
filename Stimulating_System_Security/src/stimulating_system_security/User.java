/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stimulating_system_security;

/**
 *
 * @author johnley
 */
public class User {
    private String username;
    private String role;
    
    public User(String username, String role){
        this.username = username;
        this.role = role;
    }
    
    public String getRole(){
        return this.role;
    }
}