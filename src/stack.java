import java.util.Scanner;

public class stack {
    public static void main(String args[]){
        int n = 0, item;
        Scanner scan = new Scanner(System.in);
        Stck mystack = new Stck();

        while (n != 4) {
            System.out.println("Enter 1 to push.\nEnter 2 to pop.\nEnter 3 to print stack.\nEnter 4 to quit.");
            n = scan.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter a number to push.");
                    mystack.push(scan.nextInt());
                    break;
                case 2:
                    System.out.println(mystack.pop() + " Has been popped");
                    break;
                case 3:
                    mystack.print();;
                    break;
                case 4:
                    break;
            }
        }
    }
}

class Stck {
    private int tos, stck [] = new int[10];

    //initialise top of stack.
    Stck(){
        tos = -1;
    }

    //push an element onto the stack.
    void push(int n){
        if (tos == stck.length - 1)  System.out.println("Stack Overflow");
        else stck[++tos] = n;

    }
    //poping an element from the stack.
    int pop(){
        if (tos < 0){
            System.out.println("Underflow");
           return 0;
        }
        else return stck[tos--];
    }
    //printing contents of the stack.
    void print(){
        if (tos == -1) System.out.println("Stack is empty.");
        for (int i = tos; i >= 0 ; i--){
            System.out.println(stck[i]);
        }
    }
}