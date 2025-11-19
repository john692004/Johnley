/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stimulating_system_security;

/**
 *
 * @author johnley
 */
public class Stimulating_System_Security {
    private static User user;
    
    public static void main(String[] args) {
        LOGIN login = new LOGIN();
        login.setVisible(true);
    }
    
    public static void setUser(User user){
        Stimulating_System_Security.user = user;
        
        PermissionManager permissionManager = new PermissionManager(user.getRole());
    }
    
    public static void resetUser(){
        Stimulating_System_Security.user = null;
    }
}
