/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondmax;

/**
 *
 * @author Himasha
 */
public class SecondMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 0,num2 = 0;
        int [] a={31,23,12,56,37,58,98,67,45,90};
            num1=a[1];
             num2=num1;
        for(int i=1;i<a.length;i++){
             
            if(num1<a[i]){
                num2=num1;
                num1=a[i];
            }
            else if(num2<a[i]){
                num2=a[i];
            }
        }
        System.out.println("maximum number is "+num1);
        System.out.println("Second maximum number is "+num2);
       
    }
    
}
