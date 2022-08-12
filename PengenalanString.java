
package pkg26.pengenalanstring;
import java.util.Arrays;
public class PengenalanString {

    public static void main(String[] args) {
        //membuat String
        String kataString = "hallo";
        char[] kataChar= {'h','a','l','l','o'};
        
        //menampilkan String
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));
        
        //mengakses kompoonen string
        System.out.println("komponen pertsma dari char[]= "+ kataChar[3]);
        System.out.println("komponen pertsma dari String= "+ kataString.charAt(3));
        
        //merubah komponen string tidak bisa
        //karena string di java immutable
        kataChar[0]='c';
        System.out.println(Arrays.toString(kataChar));
        //kataString[0]='c' -->tidak bisa
        //kataString.charAt(0)='c' -> tidak bisa
        
        //kita bisa merubah komponen secara tidak langsung
        printAddres("kataString",kataString);
        System.out.println(kataString.substring(1,5));
        kataString = 'c'+kataString.substring(1,5);
        System.out.println(kataString);
        
        printAddres("kataString",kataString);
        //jadi sebenarnya kita membuat array baru di memory lain
        //jadi ada dua kataString yang berbeda secra address
        //kata string yang awal akan mengilang
        
        //memory dari string(String pool
        //String memiliki String pool
        //string literal sebutan untuk string yang diletakkan di string pool
        String str_1="hallo";
        String str_2="test";
        String str_3="testing";
        printAddres("str1",str_1);
        printAddres("str2",str_2);
        printAddres("str3",str_3);
        
        str_3=str_3.substring(0,4);
        printAddres("str3",str_3);
        
        String str_4="callo";
        printAddres("str4",str_4);
        
        kataString="callo";
        printAddres("kataString",kataString);
        
        //Kesimpulan
        //1.String di java itu immutable/ tidak dapat diganti
        //2. String yang berada di string pool itu reusable,memorynya lebih efisien
        //3. membuat string dengan method baru ,maka di akan diletakkan di memory lain
        //bukan di string pool
        
        //liat lebih dalam
        String a = new String("hallo");
        printAddres("a",a);
           
        
        
    }
    private static void printAddres(String nama, String data){
        int address= System.identityHashCode(data);
        System.out.println(nama+" = "+data+"\t|| address= "+Integer.toHexString(address));
         
    }
    
}
