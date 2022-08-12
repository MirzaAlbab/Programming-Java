
package pkg18.rekursifbercabang;
import java.util.*;
import java.lang.String;
public class RekursifBercabang {

    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.print("Masukkan FIboncacci ke = ");
        int nilai=Input.nextInt();
        
        int hasilfibonacci=fibonacci(nilai,"atas");
        System.out.println("nilai fiboncacci ke "+nilai+" adalah "+hasilfibonacci);
        
        //ada kalanya rekursif tidak disarankan menggunakan rekursif karena 
//        kerumitan program akan meningkat secara eksponensial sehingga membuat pc lemot
    }
    private static int fibonacci(int nilai,String daun){
        System.out.println("daun "+daun);
        System.out.println("fibonacci ke - "+nilai);
        if (nilai==1 || nilai==0){
            return nilai;
        }else{
            return fibonacci(nilai-1,"kiri")+fibonacci(nilai-2,"kanan");
        }
        
        
    } 
}
