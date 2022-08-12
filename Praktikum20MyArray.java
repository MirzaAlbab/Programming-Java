/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum20;

/**
 *
 * @author LENOVO
 */
public class MyArray {
    int [] data;
    int size;
    
    MyArray(int n){
        size=n;
        data = new int [size];
        for (int i=0; i<size; i++){
        data [i]=0;
    }
    }
    public void display(){
        for (int i=0; i<size; i++){
            System.out.print(data[i]+"  ");
        }
    }
    public void set(int index,int elemen){
        data[index]=elemen;
    }
    public int get (int index){
        return data [index];
    }
    public int sum(){
        int result=0;
        for (int i=0; i<size; i++)
            result=result + data[i];
        return result;
    }
    public double average(){
        double ratarata;
        double result=0.0;
        for (int i=0; i<size; i++)
            result=result + data[i];
        ratarata=result/size;
        return ratarata;
    }
    public double varians(){
        double varians=0; double kuadrat=0;
        for (int i=0; i<size; i++){
            kuadrat=kuadrat+(data[i]-average())*(data[i]-average());
        }
        varians=kuadrat/size;
        return varians;
    }
    public int max(){
        int a;
        int max=0;
        for (int i=0; i<size-1; i++){
            for (int j=i+1; j<size; j++){
                if (data[i]>data [j]){
                    a = data [j];
                    data[j]=data[i];
                    data[i]=a;
            }
            }
        }
        return data[size-1];
    }
    public int min(){
        int a;
        int min=0;
        for (int i=0; i<size-1; i++){
            for (int j=i+1; j<size; j++){
                if (data[i]<data [j]){
                    a = data [j];
                    data[j]=data[i];
                    data[i]=a;       
            }
        }
    }
        return data[size-1];
    }
    public int range(){
        int range;
        range=max()-min();
        return range;
    }
    public int modus(){
        int c=data[0];
        int b=0; int besar=0;int hasil=0;
        for (int i=0; i<size ;i++){
                    if(data[i]==c){
                    //System.out.print(data[i]+" ");
                    //System.out.println(++b);
                    b++;
                          if(b>besar){
                          besar=b;
                          hasil=c;
                           }
                    }
                    else{
                    c=data[i];
                    b=1;
                    //System.out.print(data[i]+" ");
                    //System.out.println(b);
                        }
        }
    return hasil;
    }
}
