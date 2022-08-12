package koversidata;
public class KoversiData {
    public static void main(String[] args) {
        int NilaiInt=450; //32bit
        System.out.println("NilaiInt = "+ NilaiInt ); 
        
        //memperluas rentang ke tipe data yang lebih luas
        long NilaiLong=NilaiInt;
        System.out.println("NilaiLong = "+NilaiLong);
        
        //memperkecil rentang data ke tipe data yang lebih kecil
        byte NilaiByte=(byte)NilaiInt;
        System.out.println("NilaiByte = "+NilaiByte);
        System.out.println("NilaiMax = "+Byte.MAX_VALUE);
        System.out.println("NilaiMin = "+Byte.MIN_VALUE);
        
        //karena rentang data byte kecil sehingga nilainya ngaco, dia akan memutar ke nilai minimum
        //urutannya yaitu byte,short,integer,long
        
        //casting pembagian
        int a=10;
        float b=4;
        float c=a/b;
        System.out.printf("%d/%f=%f\n",a,b,c);
        
        int a1=10;
        int b1=4;
        float c1=(float)a/b;//disebut casting
        System.out.printf("%d/%d=%f\n",a1,b1,c1);
        
    
    }
    
}
