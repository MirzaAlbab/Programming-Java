
package pkg24.arraymultidimensi;
import java.util.Arrays;
public class ArrayMultiDimensi {
 
    public static void main(String[] args) {
        //cara membuat array 2 dimensi dengan assignment
        int[][]array2d={
            {1,2},
            {3,4}
        };
        printArray3(array2d);
        //cara membuat array2dimensi dengan ddeklarasi
        //int[baris][kolom]
        int[][]array2D=new int[5][4];
        printArray3(array2D);
        System.out.println(array2D.length);
        
        //looping lengkap secara manual
//        for(int i=0; i<array2D.length;i++){
//            System.out.print("[");
//            for(int j=0;j<array2D[i].length;j++){
//                System.out.print(array2D[i][j]+",");
//            }
//            System.out.print("]\n");
//            
//        }
        
//        //looping for each
//        for (int[] baris:array2D){
//            System.out.print("[");
//            for(int angka:baris){
//                System.out.print(angka+",");
//            }
//            System.out.print("]\n");
//        }
        
        int[][] array2Di={
            {1,2,3,4,5,},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        printArray3(array2Di);
        
        int[][] arrayRagged={
            {1,2,3},
            {4,5,6,7},
            {8}
        };
        printArray3(arrayRagged);
        int[]ArrayAngka={1,2,3,4};
        System.out.println(ArrayAngka);
        char[]Array={'b','b','b','b'};
        System.out.println(Array);
        String[]ArrayS={"halo dunia"};
        System.out.println(ArrayS);
        System.out.println("\n");
        
        int[][]Array2Dimensi={
            {1,2,3},
            {4,5},
        };
        System.out.println(Array2Dimensi);
        System.out.println(Arrays.toString(Array2Dimensi));
        System.out.println(Array2Dimensi[0]);
        System.out.println(Array2Dimensi[1]);
        System.out.println(Arrays.deepToString(Array2Dimensi));
        System.out.println("\n");
        
        char[]array_char1={'a','b','c'};
        char[]array_char2={'d','e'};
        
        char[][] arrayChar_2D = {
        array_char1,
        array_char2,
        };
        System.out.println(arrayChar_2D);
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
        System.out.println(Integer.toHexString(System.identityHashCode(array_char2)));
        System.out.println(Arrays.toString(arrayChar_2D));
        System.out.println(Arrays.deepToString(arrayChar_2D));
    }
    private static void printArray(int[][]dataArray){
        System.out.println(Arrays.deepToString(dataArray));
    }
    private static void printArray2(int[][]dataArray){
        for(int i=0;i<dataArray.length;i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }   
    }
    private static void printArray3(int[][]dataArray){
        System.out.print("]\n");
        for (int[] baris:dataArray){
            System.out.print("[");
            for(int angka:baris){
                System.out.print(angka+",");
            }
            System.out.print("]\n");
        }   
    }   
}

