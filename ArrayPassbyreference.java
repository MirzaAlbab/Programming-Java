
package pkg21.array.passbyreference;
import java.util.Arrays;
public class ArrayPassbyreference {

    public static void main(String[] args) {
        
        int[] array1={1,2,3,4,5};
        int[]array2=new int[5];
        
        //menunjukkan alamat array
        System.out.println("alamat array 1 -->"+array1);
        System.out.println("alamat array 2 -->"+array2);
        //ketika ada assignments dibawah ini 
        //maka array 2 akan memindahkan alamat array nya ke array 1
        //tidak mengcopy array 1
        array2=array1;
        //jika dibuat seperti diatas array akan memberikan referencenya
        //atau memberikan addresnya bukan nilainya
        
        System.out.println("alamat array 1 -->"+array1);
        System.out.println("alamat array 2 -->"+array2);
        
        System.out.println("array 1 -->"+Arrays.toString(array1));
        System.out.println("array 2 -->"+Arrays.toString(array2));
        
        array1[0]=100;
        array2[4]=400;
        System.out.println("array 1 -->"+Arrays.toString(array1));
        System.out.println("array 2 -->"+Arrays.toString(array2));
        
        ubahArray(array1);
        System.out.println("array 1 -->"+Arrays.toString(array1));
        System.out.println("array 2 -->"+Arrays.toString(array2));
    }
    //method yang argumennya reference, pass by reference
    //bukan pass by value
    //pas by reference karena parameternya array
    //pass by value jika parameternya int dll 
    private static void ubahArray(int[]dataArray){
        dataArray[0]=125;
        
    }
}
