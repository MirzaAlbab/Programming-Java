
package pkg20.array;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        //cara membuat array ada 2
        //assigment
        //tipe data[] nama array= {isi array}
        //deklarasi
        //tipe data[]=new int[jumlaha rray]
        int [] ArrayAngka={11,12,13,14,15,16,17,18,19,20};
        //konversi array ke string untuk mempermudah melihat array
        System.out.println(Arrays.toString(ArrayAngka));
        
        //looping standar
        System.out.println("looping standar");
        for(int i=0;i<10;i++){
            System.out.println("array indeks ke -"+i+" adalah "+ArrayAngka[i]);
        }  
        //looping dengan property array
        System.out.println("looping dengan properti length");
        for(int i=0; i<ArrayAngka.length ;i++){
            System.out.println("array indeks ke -"+i+" adalah "+ArrayAngka[i]);
        }
        
        //looping khususon collection <-- Array
        System.out.println("looping for each");
        for(int Angka:ArrayAngka){
            System.out.println("angka pada looping ini adalah "+Angka);
        }
    }
    
}
