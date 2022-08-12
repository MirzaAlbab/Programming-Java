package pkg9.switchcase;
import java.util.*;
public class SwitchCase {

    public static void main(String[] args) {
        Scanner User = new Scanner(System.in);
        String Input;
        
        System.out.print("Masukkan Nama ");
        Input=User.next();
        
        //ekspresi switch berupa satuan(int,long,short,byte) String dan Enum
        //break digunakan agar setelah menjalankan 1 case keluar dari switch
        //jika tidak ada ada break, misal case 1 benar maka case lainnya akan dijalankan
        switch(Input){
            case "Ucup":
                System.out.println(Input+" hadir boss!");
                break;
            case "Mario":
                System.out.println(Input+" Hadir bos!!");
                break;
            case "Pukis":
                System.out.println(Input+" Hadir bos!!!");
                break;
            default:
                System.out.println("Tidak hadir boss!!");       
        }
        System.out.println("Program selesai");
    }
    
}
