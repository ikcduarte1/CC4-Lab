import java.util.Scanner;
import java.util.Stack;

public class stackmk2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data type of the stack (e.g. Integer, String, Double, Character):");
        String dataType = sc.next();

        System.out.print("Enter the maximum size of the stack: ");
        int maxSize = sc.nextInt();

        Stack<Object> stack = new Stack<>();
        while (true) {
            System.out.println("\n[1] Push an element into the stack");
            System.out.println("[2] Pop an element into the stack");
            System.out.println("[3] Display the contents of the stack");
            System.out.println("[0] Exit\n");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            Object element;

            switch (choice) {
                case 1:
                    if (stack.size() == maxSize) {
                        System.out.println("The stack is full.");
                    } else {
                        System.out.print("Enter the element to be pushed: ");
                        if (dataType.equals("Integer")) {
                            element = sc.nextInt();
                        } else if (dataType.equals("Double")) {
                            element = sc.nextDouble();
                        } else if (dataType.equals("Character")) {
                            element = sc.next().charAt(0);
                        } else if (dataType.equals("String")) {
                            element = sc.next();
                        } else {
                            System.out.println("Unsupported data type.");
                            continue;
                        }
                        stack.push(element);
                        System.out.println(element + " pushed.");
                    }
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("The stack is empty.");
                    } else {
                        element = stack.pop();
                        System.out.println(element + " popped.");
                    }
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack: " + stack);
                        System.exit(0);
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}