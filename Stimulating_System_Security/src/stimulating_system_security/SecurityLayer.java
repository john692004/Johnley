/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stimulating_system_security;

/**
 *
 * @author johnley
 */
import java.util.Random;

public class SecurityLayer {
    private String password;
    private String faCode = "";
    public int tryCount = 0;
    
    public void generateFaCode(){
        Random random = new Random();
        for(int i = 0; i <= 5; i++){
            faCode += random.nextInt(10);
        }
        
        System.out.println("FA Code: " +faCode);
    }
    
    public boolean checkPassword(String password){
        boolean isPasswordCorrect = false;
        if(password.equals(faCode)){
            isPasswordCorrect = true;
        }
        
        return isPasswordCorrect;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getCode(){
        return faCode;
    }
}
