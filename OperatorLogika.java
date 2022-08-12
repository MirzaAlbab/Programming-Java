
package pkg6.operatorlogika;

public class OperatorLogika {

    public static void main(String[] args) {
        //operator logika --> operasi yang bisa kita lakukan pada tipe data boolean
        //AND,OR,XOR,Negasi
        
        boolean a,b,c;
        
        //OR / atau(||)
        System.out.println("===OR===");
        a=false;
        b=false;
        c=(a||b);
        System.out.println(a +" || "+b+" = "+c);
        a=false;
        b=true;
        c=(a||b);
        System.out.println(a +" || "+b+" = "+c);
        a=true;
        b=false;
        c=(a||b);
        System.out.println(a +" || "+b+" = "+c);
        a=true;
        b=true;
        c=(a||b);
        System.out.println(a +" || "+b+" = "+c);
        
        //AND / dan(&&)
        System.out.println("===AND===");
        a=false;
        b=false;
        c=(a&&b);
        System.out.println(a +" && "+b+" = "+c);
        a=false;
        b=true;
        c=(a&&b);
        System.out.println(a +" && "+b+" = "+c);
        a=true;
        b=false;
        c=(a&&b);
        System.out.println(a +" && "+b+" = "+c);
        a=true;
        b=true;
        c=(a&&b);
        System.out.println(a +" && "+b+" = "+c);
        
        //XOR / Eclusiveor(^)
        System.out.println("===XOR===");
        a=false;
        b=false;
        c=(a^b);
        System.out.println(a +" ^ "+b+" = "+c);
        a=false;
        b=true;
        c=(a^b);
        System.out.println(a +" ^ "+b+" = "+c);
        a=true;
        b=false;
        c=(a^b);
        System.out.println(a +" ^ "+b+" = "+c);
        a=true;
        b=true;
        c=(a^b);
        System.out.println(a +" ^ "+b+" = "+c);
        
        //NOT Negasi -->flipping(!)
        System.out.println("===NEGASI===");
        a=true;
        c=!a;
        System.out.println(a +" --> (!) = "+c);
        a=false;
        c=!a;
        System.out.println(a +" --> (!) = "+c);
                
    }
    
}
