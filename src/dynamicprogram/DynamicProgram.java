/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogram;

/**
 *
 * @author asus
 */
public class DynamicProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = "Akbar Vito Hartono / XRPL5 / 05";
        
        tampilJudul(identitas);
    }
    private static void tampilJudul(String identitas){
        System.out.println("Identitas "+identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 2, 5, 8, 13, 21, ... dst.\n");
    }
    
}
