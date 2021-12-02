  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trapesium;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Trapesium{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a, b, t, luas;
        
        System.out.println("Masukkan Sisi Rusuk Atas");
        a = input.nextDouble();
        
        System.out.println("Masukkan Sisi Rusuk Bawah");
        b = input.nextDouble();
        
        System.out.println("Masukkan Tinggi Trapesium");
        t = input.nextDouble();
        
        luas = (a+b)/2*t;
        System.out.println("Luas Trapesium Adalah "+luas);
        
         
       
    }
    
}
