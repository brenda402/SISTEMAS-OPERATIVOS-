/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author user
 */
public class ControladorLogout {
    static Vistas.Vistalogin v = new Vistas.Vistalogin(); 
    
    public static void visible(){
        v.setVisible(true);        
    }
   
    public static void hidden() {
        v.dispose();        
    }
}
