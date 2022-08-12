/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpro.materi.pkg4.pkg7112019;

/**
 *
 * @author LENOVO
 */
public class Myarray {
    //deklarasi variabel / atribut class my array
    int[] data; //lokasi data disimpan
    int size; //ukuran array
    
    //deklarasi member function / method
    
    //constructor
    
    Myarray(int n){
        size =n;
        data = new int[size];
        for (int i=0; i<size; i++){
            data[i]=0;
        }
    }
    public void display(){
        for (int i=0; i<size; i++){
            System.out.print(data[i]+ " ");
    
    }
        System.out.println();
        
    }
    public void set(int index, int elemen){
        data[index]=elemen;
        
        
    }
    public int sum(){
        int result =0;
        for (int i =0 ; i< size; i++)
            result +=data[i];
        return result;
    }
    
}
