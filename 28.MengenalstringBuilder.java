
package pkg28.mengenalstringbuilder;
import java.lang.StringBuilder;
public class MengenalstringBuilder {

    public static void main(String[] args) {
        StringBuilder build = new StringBuilder("halo");
        printData(build);
        
        //append
        build.append(" semuanya");
        printData(build);
        
        build.append(" warga Surabaya");
        printData(build);
        
        //insert
        build.insert(19, " kota");
        printData(build);
        
        //delete
        build.delete(19, 24);
        printData(build);
        
        //rubah character pada index teertentu
        build.setCharAt(14, 'W');
        printData(build);
        
        //replace
        build.replace(20, 28, "Bandung");
        printData(build);
        
        String kalimat= build.toString();
        System.out.println(kalimat);
        int addresStr = System.identityHashCode(kalimat);
        System.out.println("address= "+ Integer.toHexString(addresStr));
    }
    private static void printData(StringBuilder dataBuilder){
        System.out.println("data= "+dataBuilder);
        System.out.println("panjang= "+dataBuilder.length());
        System.out.println("kapasitas= "+dataBuilder.capacity());
        
        int addres=System.identityHashCode(dataBuilder);
        System.out.println("addres= "+Integer.toHexString(addres));
    }
    
}
