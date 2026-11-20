package Assignment_4;

import java.util.Scanner;
import java.util.Stack;

public class Enrollment_Undo {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        int choose_option = 0;

        while (choose_option != 4) {

            System.out.println("\n1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");

            System.out.println("Enter your choice:");
            choose_option = sc.nextInt();
            sc.nextLine();

            switch (choose_option) {

                case 1:
                    System.out.println("Enter learner name:");
                    String name = sc.nextLine();

                    stack.push(name);

                    System.out.println("Enrolled: " + name);
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Nothing to undo");
                    } else {
                        String removed = stack.pop();
                        System.out.println("Undone: " + removed);
                    }
                    break;

                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Nothing to undo");
                    } else {
                        System.out.println("Last enrollment: " + stack.peek());
                    }
                    break;

                case 4:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
