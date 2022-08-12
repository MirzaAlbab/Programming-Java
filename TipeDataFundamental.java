package pkg1.tipe.data.fundamental;

public class TipeDataFundamental {

    public static void main(String[] args) {
        //integer(satuan)
        int b=10;
        System.out.println("=====INTEGER=====");
        System.out.println("Nilai Integer b = "+ b);
        System.out.println("Nilai Max = "+Integer.MAX_VALUE);
        System.out.println("Nilai Min = "+Integer.MIN_VALUE);
        System.out.println("Besar Integer = "+Integer.BYTES +" bytes");
        System.out.println("Besar Integer = "+Integer.SIZE+" bit");
        
        //byte(satuan)
        byte c=10;
        System.out.println("=====BYTE=====");
        System.out.println("Nilai Byte c = "+ c);
        System.out.println("Nilai Max = "+Byte.MAX_VALUE);
        System.out.println("Nilai Min = "+Byte.MIN_VALUE);
        System.out.println("Besar Byte = "+Byte.BYTES +" bytes");
        System.out.println("Besar Byte = "+Byte.SIZE+" bit");
        
        //short(satuan)
        short s=10;
        System.out.println("=====SHORT=====");
        System.out.println("Nilai Short s = "+ s);
        System.out.println("Nilai Max = "+Short.MAX_VALUE);
        System.out.println("Nilai Min = "+Short.MIN_VALUE);
        System.out.println("Besar Short = "+Short.BYTES +" bytes");
        System.out.println("Besar Short = "+Short.SIZE+" bit");
        
        //long(satuan)
        long l=10l;
        System.out.println("=====LONG=====");
        System.out.println("Nilai Long l = "+ l);
        System.out.println("Nilai Max = "+Long.MAX_VALUE);
        System.out.println("Nilai Min = "+Long.MIN_VALUE);
        System.out.println("Besar long = "+Long.BYTES +" bytes");
        System.out.println("Besar Long = "+Long.SIZE+" bit");
        
        //double(koma,bilangan real)
        double d=10.5d;
        System.out.println("=====DOUBLE=====");
        System.out.println("Nilai DOuble d = "+ d);
        System.out.println("Nilai Max = "+Double.MAX_VALUE);
        System.out.println("Nilai Min = "+Double.MIN_VALUE);
        System.out.println("Besar Double = "+Double.BYTES +" bytes");
        System.out.println("Besar Double = "+Double.SIZE+" bit");
        
        //float(koma,bilangan real)
        float f=-8.5f;
        System.out.println("=====FLOAT=====");
        System.out.println("Nilai Float f = "+ f);
        System.out.println("Nilai Max = "+Float.MAX_VALUE);
        System.out.println("Nilai Min = "+Float.MIN_VALUE);
        System.out.println("Besar Float = "+Float.BYTES +" bytes");
        System.out.println("Besar Float = "+Float.SIZE+" bit");
        
        //char(Karakter) berdasarkan ASCII
        char w='w';
        System.out.println("=====CHAR=====");
        System.out.println("Nilai Char w = "+ w);
        System.out.println("Nilai Max = "+Character.MAX_VALUE);
        System.out.println("Nilai Min = "+Character.MIN_VALUE);
        System.out.println("Besar Char = "+Character.BYTES +" bytes");
        System.out.println("Besar Char = "+Character.SIZE+" bit");
        
        //boolean(nilai True atau False)
        boolean val=true;
        System.out.println("=====BOOLEAN=====");
        System.out.println("Nilai Float val = "+ val);
        System.out.println("Nilai Max = "+Boolean.TRUE);
        System.out.println("Nilai Min = "+Boolean.FALSE);
        
        //tipe data primitif karena ukuran max dan min nya fix, 
        //tidak ada variabel unsigned yaitu tidak ada tanda yang berarti nilainya misal byte mnejadi 2 kali lipat nilainya
        //unsigned terdapat pada misalnya program c++
        //string adalah tipe data high level karena dapat berupa kalimat kata dan lain sebaganya
        
        System.out.println("Hello world");
        System.out.print("Halo Dunia");
        System.out.print("Halo Dunia\n");
        System.out.printf("Halo Dunia %d\n",33);
        
        int variable1=10;
        int variable2=5;
        int hasil=variable1/variable2;
        System.out.printf("%d/%d=%d\n", variable1,variable2,hasil);
        
        
        float a=6;
        float g=5;
        float hasilf;
        hasilf=a/g;
        System.out.printf(a+"/"+g +"="+ hasilf);
        
    }
    
}
