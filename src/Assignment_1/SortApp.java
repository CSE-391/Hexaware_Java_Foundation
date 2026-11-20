
package Assignment_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortApp {

    public static void main(String[] args) {

        Course c1 = new Course(101, "Java", 15000);
        Course c2 = new Course(102, "Python", 12000);
        Course c3 = new Course(103, "React", 15000);
        Course c4 = new Course(104, "SQL", 8000);
        Course c5 = new Course(105, "Angular", 12000);

        List<Course> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        System.out.println("Total Number of Courses: " + list.size());
        System.out.println(" ");

        System.out.println("All Courses");
        System.out.println(" ");

        for(Course c : list) {
            System.out.println(c);
        }
        System.out.println("----------------------------------------------");

        System.out.println("All Courses in ASC order by Fee");
        System.out.println(" ");
        sortCourses(list, "ASC", "fee");
        System.out.println("----------------------------------------------");

        System.out.println("All Courses in DESC order by Fee");
        System.out.println(" ");
        sortCourses(list, "DESC", "fee");
        System.out.println("-----------------------------------------------");

        System.out.println("All Courses in A to Z order by Name");
        System.out.println(" ");
        sortCourses(list, "ASC", "name");
        System.out.println("-----------------------------------------------");
    }

    private static void sortCourses(List<Course> list, String direction, String sortBy) {

        Collections.sort(list, new CourseUtility(direction, sortBy));

        for(Course c : list) {
            System.out.println(c);
        }
    }
}
