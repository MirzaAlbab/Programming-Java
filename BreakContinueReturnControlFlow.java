
package pkg16.pkgbreak.pkgcontinue.pkgreturn.controlflow;

public class BreakContinueReturnControlFlow {
    public static void main(String[] args) {
        //break,continue,return
        int a=0;
        while(true){
            a++;
            
            if(a==10){
                break;
                //ini adalah keyword untuk memaksa keluar dari loop
                
            }else if(a==5){
                continue;
                //ini adalah keyword untuk memaksa memulai aksi dari awal
            }else if(a==7){
                return;
            }
            System.out.println("looping ke- "+a);
        }
        System.out.println("Ini adalah akhir looping");
    }
    
}
