// Muhammad Wajahat Asif
// FA19 - BSE - 027
// BSE - 3A

// Task : Stack by using Linked List

package linkedliststack;

public class LinkedListStack 
{
    Node top;
        
    class Node
    {
        int data;
        Node next;

        Node(int data) 
        {
            this.data = data;
            this.next = null;
        }
    }
    
    public void push (int data)
    {
        Node s = new Node (data);
        
        if (top == null)
        {
            top = s;
            return;
        }      
        s.next = top;
        top = s;
    }
    
    public void pop ()
    {
        if (isEmpty()) 
        {
            System.out.println("Stack UnderFlow!");
            return;
        }
        top = top.next;        
    }
    
    public int peek ()
    {
        if (isEmpty()) 
        {
            System.out.println("Stack Is Empty!");
            return 0;
        }
        return top.data;
    }
    
    public boolean isEmpty ()
    {
        return top == null;
    }
    
    public void show ()
    {
        Node temp = top;
        while (temp != null)
        {
            System.out.println("Data is : " +temp.data);
            temp = temp.next;
        }
        System.out.println("-------------------");
    }
        
    public static void main(String[] args)
    {
        LinkedListStack stack = new LinkedListStack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);        
        stack.show();
               
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
    }
}

// Muhammad Wajahat Asif
// FA19 - BSE - 027
// BSE - 3A