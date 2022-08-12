
package pkg27.operasistring;
import java.util.Scanner;
import java.lang.String;
public class OperasiString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat = "Saya suka makan pisang";
        
        //mengambil komponen String 
        System.out.println(kalimat.charAt(5));
        
        //substring
        String kata = kalimat.substring(10, 15);
        System.out.println(kata);
        
        //concatenation
        String kalimat2=kata+"bakwan";
        System.out.println(kalimat2);
        
        kata=kata+"cireng";
        System.out.println(kata);
        
        //concat dengan nonString
        int jumlah=20;
        String kalimat3= kata+" "+jumlah;//casting
        System.out.println(kalimat3);
        System.out.println(kata+" "+jumlah);
        
        //lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
        
        //replace
        String kalimat4= kalimat.replace("pisang", "comro");
        System.out.println(kalimat);
        System.out.println(kalimat4);
        
        //compare
        
        String motor1= "royal";
        String motor2= "kawasaki";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));
        
        String gor1= "bakwan";
        String gor2= "bala";
        System.out.println(gor1.compareTo(gor2));
        System.out.println(gor2.compareTo(gor1));
        
        //equality(persamaan)
        
        String katainput = "test";//ini ada di string pool
        //String kataInput= new String ("test");//ini bukan string literal
        // dan tidak berada di string pool
        String kataTest= "test";//ini juga ada string pool
        
        System.out.println("\npersamaan pada lokasi string pool");
        if (katainput==kataTest){
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }
        
        Scanner kataInput= new Scanner (System.in);
        System.out.print("\nmengambil input dari user = ");
        katainput= kataInput.next();//tidak di string pool
        System.out.println("ini adalah input dari user= "+katainput);
        
        if (katainput.equals(kataTest)){
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }
        
        
        
    }
    
}
