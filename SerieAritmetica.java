/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6;

/**
 *
 * @author rodtoral
 */
public class SerieAritmetica {
   /* Metodo recursivo que calcula la serie aritmetica de un numero N; 
        S(1=1/2=0.5
        S(N)=N/N+1 + S(N-1)
    */
    
    public static double s (double n){
        if(n==1) return 0.5;
        return n/(n+1) + s(n-1);
    } public static void main(String[] args) {
            System.out.println(s(5));
    }
  
}
