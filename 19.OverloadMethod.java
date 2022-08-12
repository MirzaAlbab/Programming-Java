
package pkg19.overloadmethod;

public class OverloadMethod {

    public static void main(String[] args) {
        // menggunakan nama yang sama untuk method tetapi argumennya bisa berubah ubah
        // contoh yang sudah ada pada java yaitu print, print bisa mengambil berbagai tipe data
        
        PrintAngka(10);
        PrintAngka(10.5f);
        PrintAngka(10.7d);
        
        int hasilinteger;
        hasilinteger=Tambah(4,5);
        PrintAngka(hasilinteger);
        
        float hasilfloat;
        hasilfloat=Tambah(4.5f,5);
        PrintAngka(hasilfloat);
        
        hasilfloat=Tambah(4,5.5f);
        PrintAngka(hasilfloat);
        
        hasilinteger=Tambah(11,12,13);
        PrintAngka(hasilinteger);
        
        
        
        
    }
    private static void PrintAngka (int angkaInteger){
        System.out.println("Angka ini adalah Integer dengan nilai= "+angkaInteger);
    }
    private static void PrintAngka (Float angkaFloat){
        System.out.println("Angka ini adalah Float dengan nilai= "+angkaFloat);
    }
    private static void PrintAngka (Double angkaDouble){
        System.out.println("Angka ini adalah Double dengan nilai= "+angkaDouble);
    }
    private static int Tambah (int angkaInteger1,int angkaInteger2){
        return angkaInteger1+angkaInteger2;
    }
    private static int Tambah (int angkaInteger1,int angkaInteger2,int angkaInteger3){
        return angkaInteger1+angkaInteger2+angkaInteger3;
    }
    private static float Tambah (float angkaFloat,int angkaInteger2){
        return angkaFloat+angkaInteger2;
    }
    private static float Tambah (int angkaInteger2,float angkaFloat){
        return angkaFloat+angkaInteger2;
    }
}
