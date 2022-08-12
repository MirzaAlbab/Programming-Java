
package FormatString;

public class Main {

    public static void main(String[] args){
        String nama = "udin";
        int umur=17;
        
        //output= nama saya adalah Udin,Umur saya adalah 17
        System.out.println("nama saya adalah "+nama+", umur saya adalah "+umur);
        
        //cara lainnya adalah dengan format string
        System.out.printf("nama saya adalah %s,umur udin adalah %d", nama,umur);
        //conversion : f -> floating point(float atau double), d->integer, c->character
        // s->string, b->boolean
        
        //struktur format = %[argumen _index$]") [flags] [width]
    }
        
    
}
