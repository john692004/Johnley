/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stimulating_system_security;

/**
 *
 * @author johnley
 */
public class PermissionManager {
    Mainpanel mpnel;
    public PermissionManager(String role){
        switch(role){
            case "Student":
                mpnel = new Mainpanel("VIEW ONLY");
                mpnel.setVisible(true);
                break;
            case "Teacher":
                mpnel = new Mainpanel("VIEW + EDIT");
                mpnel.setVisible(true);
                break;
            case "Admin":
                mpnel = new Mainpanel("FULL ACCESS");
                mpnel.setVisible(true);
                break;
            default: 
        }
    }
}
