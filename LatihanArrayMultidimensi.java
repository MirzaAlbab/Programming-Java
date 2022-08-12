
package pkg25.latihanarraymultidimensi;
import java.util.Arrays; 
public class LatihanArrayMultidimensi {

    public static void main(String[] args) {
        //penjumlahan matix
        int[][] matrix_a={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int[][] matrix_b={
            {11,12,13},
            {14,15,16},
            {17,18,19},
        };
        printArray(matrix_a);
        printArray(matrix_b);
        
        int[][]hasilTambah= tambah(matrix_a,matrix_b);
        printArray(hasilTambah);
        //perkalian matrix
        int[][] matrix_c={
            {1,2},
            {3,4},
            {5,6},
        };
        int[][] matrix_d={
            {11,12},
            {13,14},
        };
        int[][]hasilKali=kali(matrix_c,matrix_d);
        printArray(hasilKali);
    }
    private static int[][]kali(int[][]matrix1,int[][]matrix2){
        int baris_c=matrix1.length;
        int kolom_c=matrix1[0].length; 
        int baris_d=matrix2.length;
        int kolom_d=matrix2[0].length;
        //jika a*b maka baris akan mengikuti baris a dan kolom mengikuti b
        int[][]hasilKali=new int[baris_c][kolom_d]; 
        
        int buffer;
        for (int i=0; i<baris_c; i++){
            for (int j=0; j<kolom_d; j++){
                buffer=0;
                for (int k=0; k<kolom_c;k++){
                    buffer += matrix1[i][k] * matrix2[k][j];
                    
                }
                hasilKali[i][j]=buffer;
                
            }
            
        }
        return hasilKali;
        
    }
    private static int[][] tambah(int[][]matrix1,int[][]matrix2){
        int baris_a=matrix1.length;
        int kolom_a=matrix1[0].length; 
        int baris_b=matrix2.length;
        int kolom_b=matrix2[0].length;
        
        int[][]hasil=new int [baris_a][kolom_a];
        if(baris_a==baris_b && kolom_a==kolom_b){
            for (int i=0; i<baris_a; i++){
                for (int j=0;j<kolom_a;j++){
                    hasil[i][j]=matrix1[i][j]+matrix2[i][j];
                }
            }
        }else{
            System.out.println("jumlah baris atau kolom tidak sama");
        } 
        return hasil;
    }
            
        
        
        
    private static void printArray(int[][]dataArray){
        int baris = dataArray.length;
        int kolom=dataArray[0].length;
        
        for (int i=0; i<baris; i++){
            System.out.print("[");
            for (int j=0;j<kolom;j++){
                System.out.print(dataArray[i][j]);
                if (j<(kolom-1)){
                    System.out.print(",");;
                }else{
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        
        }
        System.out.print("\n");
    }
    
}
