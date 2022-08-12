package pkg10.ternaryoperator;
import java.util.*;
public class TernaryOperator {

    public static void main(String[] args) {
        //ternary Operator
        //penyederhanaan if
        int x,input;
        Scanner User = new Scanner (System.in);
        
        System.out.print("Masukkan nilai= ");
        input=User.nextInt();
        
        //variable x (ekspresi) ? statement_true : statement_false
        x=(input==10)? (input*input) : (input/2);
        
        
        //kalau menggunakan if
//        if (input==10){
//            x=input*input;
//        }else{
//            x=input/2;
//        }
        System.out.println("Hasil akhirnya yaitu "+ x);
    }
    
}
