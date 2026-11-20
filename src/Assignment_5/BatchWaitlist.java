package Assignment_5;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class BatchWaitlist {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String seats[] = new String[3];
        Queue<String> waitlist = new LinkedList<>();

        // To add learners to the batch or waitlist
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter learner name:");
            String name = sc.nextLine();

            boolean added = false;

            for (int j = 0; j < 3; j++) {
                if (seats[j] == null) {
                    seats[j] = name;
                    added = true;
                    break;
                }
            }

            if (added == false) {
                waitlist.add(name);
            }

            System.out.println("Seats: " + Arrays.toString(seats));
            System.out.println("Waiting: " + waitlist);
        }

        // To remove a learner from the batch
        System.out.println("Enter the name of the learner who drops out:");
        String drop = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            if (seats[i] != null && seats[i].equals(drop)) {

                found = true;
                seats[i] = null;

                if (!waitlist.isEmpty()) {
                    seats[i] = waitlist.poll();
                }

                break;
            }
        }

        if (found == false) {
            System.out.println("Learner not found in the batch");
        }

        System.out.println("Seats: " + Arrays.toString(seats));
        System.out.println("Waiting: " + waitlist);

        sc.close();
    }
}
