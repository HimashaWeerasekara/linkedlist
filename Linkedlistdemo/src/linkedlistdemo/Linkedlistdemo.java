/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;

/**
 *
 * @author 174159p
 */
public class Linkedlistdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Linkedlist z=new Linkedlist();
        z.insertFirst(9);
        z.insertFirst(7);
        z.insertFirst(21);
        z.insertFirst(5);
        z.displayList();
        z.delete(7);
        z.displayList();
        z.insertFirst(11);
        z.insertFirst(99);
        z.displayList();
        
    }
    
}

class Node{
    int item;
    Node next;
    
    public Node(int item){
       this.item=item;
       this.next=null;
       }
    
    public void display()
    {
    System.out.println(this.item +"");
    
    }
}

class Linkedlist{
    private Node head;
    
    public Linkedlist()
    {
        head=null;
    }
    
    public boolean isEmpty(){
        // return(head==null);
       if(head==null)
           return true;
       else
           return false;
    }
    
    public void insertFirst(int i)
    {
    Node n=new Node(i);
    n.next=head;
    head=n;
    }

  public Node deleteFirst() {
     if(isEmpty()){
         System.out.println("linked list is empty nothing to celete." );
         return null;
  
  }
          
      Node temp=head;
      head=head.next;//runtime exception occurs because there head is null,we can't access next value of null value
      temp.next=null;
      return temp;
     } 
  
  public void displayList(){
      if(isEmpty()){
         System.out.println("Linked list is empty");
        return;
      }
      
        Node current=head;
            
        while(current!=null)
        {
        System.out.println(current.item +"");  //current.display();
        
        current=current.next;
        }
         System.out.println();
  
  
  
  }
  
 public Node find(int key){ // you can use if condition if the key is negative value
      if(isEmpty())
      {
      System.out.println("Linked list is empty ,nothing to find.");
      return null;
      }
          
     int i=1;
    Node current=head;
     
   while(current!=null)
   {
      if(i==key)
        return current;   
      current=current.next;
      i++;
   }
        System.out.println("Keyb is out of the linked list");
        return null;
 
 
 }
  public void delete(int key){
          if(isEmpty()){
        System.out.println("Nothng to delete");
  }
  
      Node current,previous;
     current=head;
     previous=head;
     int i=1;
     while(current!=null){
         if(i==key){
             if(current==head){
             head=head.next;
             }
             else{
     previous.next=current.next;
             }
      System.out.println(current.item +"");
      return;
     }  
     
  previous=current;
  current=current.next;
  i++;
  
  }
  
 System.out.println("No item found for the key deletion terminator");// deletion key is out of the bound
  
}  

}