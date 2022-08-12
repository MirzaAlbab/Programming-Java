
package praktikum21;

public class MyArray {
    int [] data;
    int size;
    int [] datacopy;
    int sizecopy;
    
    MyArray(int n){
        size=n;
        sizecopy=n;
        data = new int [size];
        datacopy= new int [sizecopy];
        for (int i=0; i<size; i++){
        data [i]=0;
        datacopy[i]=0;
    }
        
    }
    public void display(){
        for (int i=0; i<size; i++){
            System.out.print(data[i]+"  ");
        }
    }
    public void set(int index,int elemen){
        data[index]=elemen;
        datacopy[index]=elemen;
        
    }
    public void shiftleft(){
        
        for (int i=0; i<size-1; i++){
            data[i]=data [i+1];
            if (data[i]==data[i+1])
                data [i+1]=0;
        }
    }
    public void shiftLeft(int k){
        for (int i=0; i<k; i++){
          shiftleft();
        }
    }
    public void array(){
        for (int i=0; i<sizecopy; i++){
            data[i]=datacopy[i];
        }
    }
    public void shiftright(){
       
       for (int i=size-1; i>0; i--){
            data[i]=data [i-1];
            if (data[i]==data[i-1])
                data [i-1]=0;
    }
       }       
    public void shiftRight(int k){
        for (int i=0; i<k; i++){
            shiftright();
        }
    }
    
    public void rotateleft(){
        int temp;
        temp=data[0];
        shiftleft();
        for (int i=0; i<size; i++){
            if (data[i]==0){
            data [i]=temp;    
            break;
            }
        }
    }
   
    public void Rotateleft (int k){
        for (int i=0; i<k; i++)    
        rotateleft();
    }
    
    public void rotateright(){
        int temp;
        temp = data[size-1];
        shiftright();
        for (int i=size-1; i>=0; i--){
            if (data[i]==0){
            data [i]=temp;
            break;
            }
        }
    }

    public void rotateRight(int k){
        for (int i=0; i<k; i++)
        rotateright();
    }
    public void deleteDuplicate() {
        int hasil[] = new int[size], index = 0;
        
        for (int i = 0 ; i < size ; i++) {
            if(cek[i]!=1){
                cek[i] = 1;
                for (int j = i ; j < size ; j++) {
                    if(data[i] == data[j]) {
                        cek[j] = 1;
                    }
                }
                hasil[index] = data[i];
                index++;
            }
        }
        //System.out.print("[");
        //for (int i = 0 ; i < index-1 ; i++)
            //System.out.print(hasil[i] + ", ");
        //System.out.println(hasil[index-1]+"]");
    
}
    

