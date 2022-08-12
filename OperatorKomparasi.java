
package pkg5.operatorkomparasi;
public class OperatorKomparasi {

    public static void main(String[] args) {
        //operator komparasi akan menghasilkan nilai dalam bentuk boolean
        int a,b;
        boolean HasilKomparasi;
        //operator equal / persamaan
        System.out.println("----PERSAMAAN");
        a =10;
        b =10;
        HasilKomparasi=(a==b);
        System.out.printf(" %d == %d --> %s\n",a,b,HasilKomparasi);
        
        a =12;
        b =10;
        HasilKomparasi=(a==b);
        System.out.printf(" %d == %d --> %s\n",a,b,HasilKomparasi);
        
        //operator not equal / pertidaksamaan
        System.out.println("----PERTIDAKSAMAAN");
        a =10;
        b =10;
        HasilKomparasi=(a!=b);
        System.out.printf(" %d != %d --> %s\n",a,b,HasilKomparasi);
        
        a =12;
        b =10;
        HasilKomparasi=(a!=b);
        System.out.printf(" %d != %d --> %s\n",a,b,HasilKomparasi);
        
        //operator kurang dari 
        System.out.println("----KURANG DARI");
        a =9;
        b =10;
        HasilKomparasi=(a<b);
        System.out.printf(" %d < %d --> %s\n",a,b,HasilKomparasi);
        
        a =12;
        b =10;
        HasilKomparasi=(a<b);
        System.out.printf(" %d < %d --> %s\n",a,b,HasilKomparasi);
        
        //operator lebih dari
        System.out.println("----LEBIH DARI");
        a =9;
        b =10;
        HasilKomparasi=(a>b);
        System.out.printf(" %d > %d --> %s\n",a,b,HasilKomparasi);
        
        a =12;
        b =10;
        HasilKomparasi=(a>b);
        System.out.printf(" %d > %d --> %s\n",a,b,HasilKomparasi);
        
        //operator kurang dari sama dengan
        System.out.println("----KURANG DARI SAMA DENGAN");
        a =9;
        b =10;
        HasilKomparasi=(a<=b);
        System.out.printf(" %d <= %d --> %s\n",a,b,HasilKomparasi);
      
        a =10;
        b =10;
        HasilKomparasi=(a<=b);
        System.out.printf(" %d <= %d --> %s\n",a,b,HasilKomparasi);
        
        a =12;
        b =10;
        HasilKomparasi=(a<=b);
        System.out.printf(" %d <= %d --> %s\n",a,b,HasilKomparasi);
        
        //operator lebih dari sama dengan
        System.out.println("----LEBIH DARI SAMA DENGAN");
        a =9;
        b =10;
        HasilKomparasi=(a>=b);
        System.out.printf(" %d >= %d --> %s\n",a,b,HasilKomparasi);
        
        a =10;
        b =10;
        HasilKomparasi=(a>=b);
        System.out.printf(" %d >= %d --> %s\n",a,b,HasilKomparasi);
        
        a =12;
        b =10;
        HasilKomparasi=(a>=b);
        System.out.printf(" %d >= %d --> %s\n",a,b,HasilKomparasi);
    }
    
}
