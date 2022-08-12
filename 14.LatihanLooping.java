
package pkg14.latihanlooping;
import java.util.*;
public class LatihanLooping {

    public static void main(String[] args) {
        int nilaiAwal,nilaiAkhir,total,pilihan;
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Awal= ");
        nilaiAwal=Input.nextInt();
        System.out.print("Masukkan Nilai Akhir= ");
        nilaiAkhir=Input.nextInt();
        
        System.out.println("Masukkan Jenis Looping ");
        System.out.println("1.While");
        System.out.println("2.For");
        System.out.println("3.Do While");
        pilihan=Input.nextInt();
        
        total=0;
        switch(pilihan){
            case(1):
                System.out.println("WHILE LOOPING");
                while(nilaiAwal<=nilaiAkhir){
                    total=total+nilaiAwal;
                    System.out.println("ditambah "+nilaiAwal+" menjadi "+total);
                    nilaiAwal++;
                }
                break;
            case(2):
                System.out.println("FOR LOOPING");
                for(int i=nilaiAwal ;i<=nilaiAkhir;i++){
                    total=nilaiAwal+total;
                    System.out.println("ditambah "+nilaiAwal+" menjadi "+total);
                    nilaiAwal++;
                }
                break;
            case(3):
                System.out.println("DO WHILE LOOPING");
                do{
                    total=nilaiAwal+total;
                    System.out.println("ditambah "+nilaiAwal+" menjadi "+total);
                    nilaiAwal++;
                
            }while(nilaiAwal<=nilaiAkhir);
                break;
            default:
                System.out.println("Looping tidak ditemukan");
                
        }
        
        
        
        
        
        
        
    }
    
}
