
package pkg7.operatorbitwise;

public class OperatorBitwise {

    public static void main(String[] args) {
        //operator bitwise --> Operator untuk melakukan operasi pada nilai bit
        
        byte a=3;
        byte b,c;
        String a_bits,b_bits,c_bits;
        
        
        //Operator SHIFT LEFT(<<)
        System.out.println("===SHIFTLEFT===(<<)");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%s = %d\n",a_bits,a);
        b=(byte)(a<<3);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%s = %d\n",b_bits,b);
        
        //Operator SHIFT RIGHT(>>)
        System.out.println("===SHIFTRIGHT===(>>)");
        a=24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%s = %d\n",a_bits,a);
        b=(byte)(a>>2);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%s = %d\n",b_bits,b);
        
        
        //Operator BITWISE OR(|)
        System.out.println("===BITWISE OR===(|)");
        a=24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%s = %d\n",a_bits,a);
        b=12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%s = %d\n",b_bits,b);
        System.out.println("-----------OR");
        c=(byte)(a|b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ' , '0');
        System.out.printf("%s = %d\n",c_bits,c);
        
        //Operator BITWISE AND(|)
        System.out.println("===BITWISE AND===(&)");
        a=24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%s = %d\n",a_bits,a);
        b=12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%s = %d\n",b_bits,b);
        System.out.println("-----------AND");
        c=(byte)(a&b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ' , '0');
        System.out.printf("%s = %d\n",c_bits,c);
        
        //Operator BITWISE XOR(^)
        System.out.println("===BITWISE XOR===(^)");
        a=24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%s = %d\n",a_bits,a);
        b=12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%s = %d\n",b_bits,b);
        System.out.println("-----------XOR");
        c=(byte)(a^b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ' , '0');
        System.out.printf("%s = %d\n",c_bits,c);
        
        //Operator Negasi(NOT)
        System.out.println("===BITWISE NOT===(~)");
        a=24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%s = %d\n",a_bits,a);
        b=(byte)(~a);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d\n",b_bits,b);        
    }
    
}
