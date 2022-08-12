package pkg3.operatorunary.decrementincrement;
public class OperatorUnaryDecrementIncrement {
public static void main(String[] args) {
    //unary yaitu operasi yang dilakuka pada satu variable
    //unary + dan minus
    int angka=1;
    System.out.printf("unary '+' %d menjadi %d\n",angka,+angka);
    System.out.printf("unary '-' %d menjadi %d\n",angka,-angka);
    
    
    //unary decrement dan increment
    int angka2=10;
    angka2++;//increment
    System.out.println("nilai dengan '++' menjadi "+angka2);
    
    int angka3=10;
    angka3--;//decrement
    System.out.println("nilai dengan '--' menjadi "+angka3);
    
    //Postfix dan prefix Increment dan Decrement
    int a=5;
    System.out.printf("nilai dengan '++' prefix menjadi = %d\n",++a);
    int b=5;
    System.out.printf("nilai dengan '++' postfix menjadi = %d\n",b++);
    System.out.printf("nilai hasil dari postfix menjadi = %d\n",b);
    
    //unary boolean ! untuk negasi
    boolean ucup = true;
    System.out.println("nilai boolean "+ucup);
    System.out.println("nilai boolean "+!ucup);
    
        
    }
    
}
