/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author rodtoral
 */
public class Tema6 {

    public static int sumatorio2(int n){
        int suma=0;
        for (int i = n; i>=1;i--){
            suma+=1;
        }
        return suma;
    }
    public static int sumatorio (int n){
        if(n==1)return 1;
        return n + sumatorio (n-1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sumatorio(5));
        System.out.println(sumatorio2(5));
    }
    
}
