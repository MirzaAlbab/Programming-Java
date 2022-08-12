
package pkg15.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int fn,fn_1,fn_2,n,pilihan;
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Masukkan Deret Fibonacci Ke= ");
        n=Input.nextInt();
        
        System.out.println("Masukkan Jenis Looping ");
        System.out.println("1.While");
        System.out.println("2.For");
        System.out.println("3.Do While");
        pilihan=Input.nextInt();
        
        int counter=0;
        
        int a=1;
        fn=1;
        fn_1=1;
        fn_2=0;
        switch(pilihan){
            case(1):
                System.out.println("WHILE LOOPING");
                while(counter<n){
                    System.out.println("nilai ke - "+a+" adalah "+fn);
                    fn=fn_2+fn_1;
                    fn_2=fn_1;
                    fn_1=fn;
                    a++;
                    counter+=1;
                }
                break;
            case(2):
                System.out.println("FOR LOOPING");
                for(int i=1 ;i<=n;i++){
                    System.out.println("nilai ke - "+i+" adalah "+fn);
                    fn=fn_2+fn_1;
                    fn_2=fn_1;
                    fn_1=fn;
                }
                break;
            case(3):
                System.out.println("DO WHILE LOOPING");
                do{
                    System.out.println("nilai ke - "+a+" adalah "+fn);
                    fn=fn_2+fn_1;
                    fn_2=fn_1;
                    fn_1=fn;
                    a++;
                    counter+=1;
            }while(counter<n);
                break;
            default:
                System.out.println("Looping tidak ditemukan");
                
        }
    }
    
}
