/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuearrayapp;

/**
 *
 * @author Himasha
 */
public class QueueArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class QueueArray{
    private int nElent;
    private int queuearry[];
    private int frount;
    private int rear;
    private int maxsize;
    
    public QueueArray(int s){
        this.nElent=0;
        this.maxsize=s;
        this.queuearry=new int[s];
        this.frount=0;
        this.rear=-1;
    
    }
    
    public boolean isEmpty(){
        return this.nElent==0;
    } 
    
    public boolean isFull(){
        return this.maxsize==this.nElent;
    }
    public int size(){
        return this.nElent;
    }
    public void Enqueue(int a){
        if(isFull()){
            System.out.println("cannot insert array is full");
            return;
        }
        if(this.rear==maxsize-1){
           this.rear=0;
        }
        else{
            this.rear++;
        }
        this.queuearry[rear]=a;
        this.nElent++;
        System.out.println("value inserted");
        return ;
    }
    public void Dequeue(){
        if(isEmpty()){
            System.out.println("array is empty");
            return;
        }
        int temp= queuearry[frount];
        
        if(frount==maxsize-1){
            this.frount=0;
        }
        else{
        this.frount=this.frount+1;
        }
        this.nElent--;
        System.out.println("Dequeue successfully");
    }
    public int peek(){
        if(isEmpty()){
           System.out.println("array is empty cannot found peek");
        }
        return this.queuearry[this.frount];
    }
    
    public void Display(){
        if(isEmpty()){
            System.out.println("Queue is empty. Nothing to display");
            return;
        }
        int i=this.frount;
        while(i!=this.rear){
            System.out.print(queuearry[i] +" ");
            if(i==maxsize-1){
                i=0;
            }
            else{
                i++;
            }
        }
       System.out.print(queuearry[rear] +" "); 
        System.out.println("");
        
    }
}

