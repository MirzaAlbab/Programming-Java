
package pkg12.pkgwhile;

public class While {

    public static void main(String[] args) {
//        while looping
//        while(kondisi){
//          aksi
//        }
        int a=0;
        boolean kondisi = true;
        
        System.out.println("Ini adalah awal program");
        while(kondisi){
            System.out.println("While loop ke- "+a);
            a++;
            
            if(a==10){
                kondisi=false;
            }
        }
        System.out.println("ini adalah akhir program");
        
        System.out.println("========");
        
        //do while
//        do{
//            aksi
//        }while(kondisi);
        int b=0;
        boolean kondisi_2 = true;
        
        System.out.println("Ini adalah awal program");
        do{
            b++;
            System.out.println("Do While loop ke- "+b);
            if(b==1){
                kondisi_2=false;
            }
        }while(kondisi_2);
        System.out.println("ini adalah akhir program");
        
    }
    
}
