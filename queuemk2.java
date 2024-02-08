import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queuemk2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data type of the queue (e.g. Integer, String, Double, Character):");
        String dataType = sc.next();

        System.out.print("Enter the maximum size of the queue: ");
        int maxSize = sc.nextInt();

        Queue<Object> queue = new LinkedList<>();
        while (true) {
            System.out.println("\n[1] Enqueue an element into the queue");
            System.out.println("[2] Dequeue an element into the queue");
            System.out.println("[3] Display the contents of the queue");
            System.out.println("[0] Exit\n");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            Object element;

            switch (choice) {
                case 1:
                    if (queue.size() == maxSize) {
                        System.out.println("The queue is full.");
                    } else {
                        System.out.print("Enter the element to be enqueued: ");
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
                        queue.offer(element);
                        System.out.println(element + " enqueued.");
                    }
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        element = queue.poll();
                        System.out.println(element + " dequeued.");
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue: " + queue);
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