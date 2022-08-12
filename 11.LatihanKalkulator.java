
package pkg11.latihankalkulator;
import java.util.*;
public class LatihanKalkulator {

    public static void main(String[] args) {
        //Menggunakan if else
        Scanner User;
        float a,b,hasil;
        char operator;
        User = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai a= ");
        a=User.nextFloat();
        System.out.print("Masukkan Operator= ");
        operator=User.next().charAt(0);
        System.out.print("Masukkan Nilai b= ");
        b=User.nextFloat();
        
        System.out.println("Input User = "+ a + " " +operator+ " " +b);
        
        //operator tersedia +,-,*,/
        if (operator=='+'){
            //Penjumlahan
            hasil=a+b;
            System.out.println("hasil= "+hasil);
        }else if (operator=='-'){
            //Pengurangan
            hasil=a-b;
            System.out.println("hasil= "+hasil);
        }else if (operator=='*'){
            //Perkalian
            hasil=a*b;
            System.out.println("hasil= "+hasil);
        }else if (operator=='/'){
            //Pembagian
            if (b==0){
                System.out.println("pembagi nol menghasilkan tak hingga");
            }else{
            hasil=a/b;
            System.out.println("hasil= "+hasil);    
            }
        }else{
            System.out.println("operator tidak ditemukan");
        }
        //menggunakan switch case
        String operator_2;
        System.out.println("Masukkan operator String");
        operator_2=User.next();
        switch(operator_2){
            case"+":
                //penjumlahan
                hasil=a+b;
                System.out.println("hasil= "+hasil);
                break;
            case"-":
                //pengurangan
                hasil=a-b;
                System.out.println("hasil= "+hasil);
                break;
            case"*":
                //perkalian
                hasil=a*b;
                System.out.println("hasil= "+hasil);
                break;
            case"/":
                //pembagian
                hasil=a/b;
                System.out.println("hasil= "+hasil); 
                break;
            default:
                System.out.println("operator "+operator_2 +"tidak ditemukan");
        }
                
    }
    
}
