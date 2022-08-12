
package pkg17.loopingbersarang;

public class LoopingBersarang {

    public static void main(String[] args) {
        for (int i =0; i<5; i++){
            for (int j=0; j<5; j++){
             System.out.print("*");   
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        for (int i =0; i<5; i++){
            for (int j=0; j<5; j++){
             System.out.print("*");   
            if(i==j){
                break;
            }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        for (int i =0; i<5; i++){
            for (int j=0; j<5; j++){
             System.out.print("*");   
            if(i+j==4){
                break;
            }
            }
           System.out.print("\n");
        }
        System.out.print("\n");
        
        for (int i =0; i<9; i++){
            for (int j=0; j<9; j++){
             System.out.print("*");   
            if(i==j){
                break;
            }else if((i+j)==8){
                break;
            }
            }
           System.out.print("\n");
        }
        System.out.print("\n");
     int a=5;
        for (int i =0; i<5; i++){
            for (int j=5; j>i; j--){
                System.out.print(" "+j);
                }
            for (int k=0;k<=i;k++){
                System.out.print("*");
            }
            
           System.out.print("\n");
        }
        System.out.print("\n");
    }
    
}
