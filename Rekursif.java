/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursif;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Rekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int z;
        z=fibonacci(4);
        System.out.println(z);
    }
    public static int fibonacci(int n){
        int result;
    if (n==0)
        return (0);
    else if (n==1)
        return (1);
    else {
        result=fibonacci(n-1)+fibonacci(n-2);
        return result;
    }
    
                
    
}
}
