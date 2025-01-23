import java.util.Scanner;

class Constructor {
    
    int a, b, s;
    
    Constructor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    
    void add() {
        s = a + b;
    }

    
    void display() {
        System.out.println("Sum of two numbers: " + s);
    }

    
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = A.nextInt();

        System.out.println("Enter the second number:");
        int b = A.nextInt();

    
        Constructor obj = new Constructor(a, b);
        obj.add();
        obj.display();
    }

    
}
