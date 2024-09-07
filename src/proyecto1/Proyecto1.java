/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import java.util.ArrayList;

/**
 * @author Jimmy
 */
public class Proyecto1 {
    
    //Arraylist<TIPO> IDENTIFICADOR = new Arraylist <>();
    
    public static ArrayList<investigador> lista_investigador = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        login login = new login();
        login.setVisible(true);
    }
    
}
