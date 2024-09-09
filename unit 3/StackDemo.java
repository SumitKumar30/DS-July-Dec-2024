// stack impelementation using Array

import java.util.Scanner;

class StackDemo{
    // function to perform insertion in stack
    static int push(int data, int top, int[] stack){
        if(isFull(top, stack)){
            System.out.println("Stack is full!!! OVERFLOW!!!");
        }
        else{
            top = top+1;
            stack[top] = data;
        }
        return top;
    }

    // function to perform deletion operation in stack
    static int pop(int top, int[] stack){
        if(isEmpty(top)){
            System.out.println("Stack is EMPTY!!!");
        }else{
            //stack[top] = 0;
            int temp = stack[top];
            top = top-1;
            System.out.println("Element deleted from the top: "+temp);
        }
        return top;
    }

    // function to perform peek operation in stack
    static int peek(int top, int[] stack  ){
        if(isEmpty(top)){
            System.out.println("Stack is EMPTY!!!");
        }
        else{
            System.out.println("Element at the top is: "+stack[top]);
        }
        return top;
    }

    static boolean isFull(int top, int[] stack){
        if(top == stack.length-1){
            return true;
        }    
        return false;
    }

    static boolean isEmpty(int top){
        if(top == -1)
            return true;
        else
            return false;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stack size: ");
        int size = sc.nextInt();

        int[] stack = new int[size];

        int top = -1;

        // System.out.println("Enter "+size+" elements into stack:");

        // // call to perform push operation
        for(int i = 0; i < stack.length-1; i++){
                top = push(sc.nextInt(), top, stack);
         }

        // top = push(10, top, stack);
        // top = push(20, top, stack);
        // top = push(30, top, stack);
        // top = push(40, top, stack);

        
        // 5System.out.print("Element at the top is: ");
        // call to perform peek operation
        top = peek(top, stack);

        // call to perform pop operation
        top = pop(top, stack);

        peek(top, stack);
        


    }

}