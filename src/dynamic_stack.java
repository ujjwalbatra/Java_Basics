import java.util.Scanner;

interface Intstack {
    void push(int item); //incert an item onto the stack.

    int pop(); //returns a deleted item.
}

public class dynamic_stack {
    public static void main(String args[]) {
        Dy_stack nn = new Dy_stack(2);
        Scanner scan = new Scanner(System.in);
        int n = 0;

        while (n != 4) {
            System.out.println("Enter 1 to push.\nEnter 2 to pop.\nEnter 3 to print stack.\nEnter 4 to quit.");
            n = scan.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter a number to push.");
                    nn.push(scan.nextInt());
                    break;
                case 2:
                    System.out.println(nn.pop() + " Has been popped\n");
                    break;
                case 3:
                    nn.print();
                    ;
                    break;
                case 4:
                    break;
            }
        }


    }
}

class Dy_stack implements Intstack {

    private int stck[];
    private int tos = -1;

    Dy_stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;

        }
        stck[++tos] = item;
        System.out.println("\nElement pushed = " + stck[tos] + " stack size = " + stck.length + "\n");
    }

    public int pop() {
        if (tos == -1) System.out.println("Underflow");
        return stck[tos--];
    }

    void print() {
        if (tos == -1) System.out.println("Stack is empty.");
        else {
            for (int i = tos; i >= 0; i--) {
                System.out.println(stck[i]);
            }
        }
    }

}