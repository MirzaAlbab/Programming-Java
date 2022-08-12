package pkg23.latihanarray.sort.jumlah.gabung;
import java.util.Arrays;
public class LatihanArraySortJumlahGabung {

    public static void main(String[] args) {
        int[] arrayAngka1 ={2,3,40,4,5,15,60,6,10};
        int[] arrayAngka2 ={0,5,3,4,5,6,7,8,9};
        //penjumlahan dua buah array
        
        int[]arrayHasil1=tambahArray(arrayAngka1,arrayAngka2);
        printArray(arrayAngka1,"array-1");
        printArray(arrayAngka2,"array-2");
        printArray(arrayHasil1,"hasil1 ");
        
        //menggabungkan dua buah array
        int[]arrayHasil2=new int[arrayAngka1.length+arrayAngka2.length];
        
        for (int i=0; i<arrayAngka1.length;i++){
            arrayHasil2[i]=arrayAngka1[i];
        }
        for (int i=0;i<arrayAngka2.length;i++){
            arrayHasil2[i+arrayAngka1.length]=arrayAngka2[i]; 
        } 
        printArray(arrayAngka1,"array-1");
        printArray(arrayAngka2,"array-2");
        printArray(arrayHasil2,"hasi12 ");
        
        //sorting reverse
        printArray(arrayAngka1,"array-1");
        reverse1(arrayAngka1);
        printArray(arrayAngka1,"reversed1");
        
        printArray(arrayAngka2,"array-2");
        reverse2(arrayAngka2);
        printArray(arrayAngka2,"reversed2");
    }
    private static void reverse2(int[]dataArray){
        Arrays.sort(dataArray);
        printArray(dataArray,"sorted");
        int buffer;
        
        for(int i=0; i<dataArray.length/2;i++){
            buffer=dataArray[i];
            dataArray[i]=dataArray[(dataArray.length-1)-i];
            dataArray[(dataArray.length-1)-i]=buffer;
        }
    }
    private static void reverse1(int[]dataArray){
        Arrays.sort(dataArray);
        printArray(dataArray,"sorted");
        
        int[]arrayBuffer=Arrays.copyOf(dataArray,dataArray.length );
        
        for (int i=0; i<dataArray.length;i++){
            dataArray[i]=arrayBuffer[(dataArray.length-1)-i];
        }
    }
    private static int[]tambahArray(int[]arrayInt1,int[]arrayInt2){
        int[]arrayHasil= new int[arrayInt1.length];
        for(int i=0; i<arrayInt1.length;i++){
            arrayHasil[i]=arrayInt1[i]+arrayInt2[i];
        }
        return arrayHasil;
    }
    private static void printArray(int[]dataArray, String message){
        System.out.println(message+" = "+Arrays.toString(dataArray));
    }
    
}
