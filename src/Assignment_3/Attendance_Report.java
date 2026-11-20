package Assignment_3;

import java.util.Scanner;

public class Attendance_Report {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int attendance[] = new int[10];
        int total[] = new int[10];

        System.out.println("Enter attendance for 10 days:");

        for (int i = 0; i < 10; i++) {
            attendance[i] = sc.nextInt();
        }

        // To Build running total
        total[0] = attendance[0];

        for (int i = 1; i < 10; i++) {
            total[i] = total[i - 1] + attendance[i];
        }
        // To get the Range
 
        System.out.println("Enter starting day:");
        int start = sc.nextInt();

        System.out.println("Enter ending day:");
        int end = sc.nextInt();

        // To Calculate attendance in the given range
        if (start >= 1 && end <= 10 && start <= end) {

            int sum;

            if (start == 1) {
                sum = total[end - 1];
            } else {
                sum = total[end - 1] - total[start - 2];
            }

            System.out.println("Total attendance: " + sum);

        } else {
            System.out.println("Invalid range");
        }

        // To Find highest attendance
        int max = attendance[0];
        int day = 1;

        for (int i = 1; i < 10; i++) {
            if (attendance[i] > max) {
                max = attendance[i];
                day = i + 1;
            }
        }

        System.out.println("Highest attendance: " + max);
        System.out.println("Day with highest attendance: " + day);

        sc.close();
    }
}

