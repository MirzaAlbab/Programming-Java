
package pkg22.operasiarray;
import java.util.Arrays;

public class OperasiArray {

    public static void main(String[] args) {
        int [] arrayAngka1={1,2,3,4,5};
        
        //mengubah array mejadi string
        System.out.println("\nmengubah array menjadi string\n=========");
        printArray(arrayAngka1);
        
        //mengkopi array
        System.out.println("\nmengkopi array\n=========");
        int[]arrayAngka2=new int [5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        
        System.out.println("\nmengkopi dengan loop\n=========");
        for(int i=0;i<arrayAngka2.length;i++){
            arrayAngka2[i]=arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
        
        System.out.println("\nmengkopi dengan Copy Of\n=========");
        int[]arrayAngka3=Arrays.copyOf(arrayAngka1, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);
        
        System.out.println("\nmengkopi dengan Copy OfRange\n=========");
        int[]arrayAngka4=Arrays.copyOfRange(arrayAngka1, 3, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
        
        //fillarray
        System.out.println("\nfill array\n=========");
        int[]arrayAngka5=new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);
        
        //komparasi array
        System.out.println("\nkomparasi array\n=========");
        int[] arrayAngka6={1,2,3,4,5};
        int[] arrayAngka7={1,2,3,4,5};
        
        System.out.println("\nmembandingkan dua buah array\n=========");
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
        
        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("array ini sama");
        }else{
            System.out.println("array ini beda");
        }
        System.out.println("\nngecek array yang lebih besar\n=========");
//        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));
        //IDE aneh harusnya ada library nya 
        //jika hasilnya 0 maka keduanya sama
        //jika hasilnya 1 maka array pertama lebih besar
        //jika hasilnya -1 maka array kedua lebih besar
        
        System.out.println("\nngecek index array yang beda\n=========");
//        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));
        //output -1 berarti tidak ada yang berbeda
        //jika selain -1 maka pada index yang pertama kali ditemukan
        
        System.out.println("\nsortarray\n=========");
        int[]arrayAngka8={1,3,4,6,7,3,2,5,66};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);
        
        //search array
        System.out.println("\nsearch array  \n=========");
        int angka=3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("angka "+angka+" ada di index "+posisi);
        
    }
    private static void printArray(int[]dataArray){
        System.out.println("array= "+Arrays.toString(dataArray));
    }
}
