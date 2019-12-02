/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplesort;

/**
 *
 * @author Himasha
 */
public class SimpalSort {
    public static void main(String[] args) {
       int temp;
      //  int[] b =new int[10];
     int[] b={10,19,28,34,567,98,67,87,18,54}; 
        
        for(int i=0;i<b.length;i++){
            for(int j=i;j<b.length;j++){
                if(b[j]>b[j+1]){
                temp=b[i];
                 b[i]=b[i+1];
                 b[i+1]=temp;
                }
            }
        }
    }
}
