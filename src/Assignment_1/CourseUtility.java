package Assignment_1;

import java.util.Comparator;

public class CourseUtility implements Comparator<Course> {

    String direction;
    String sortBy;

    public CourseUtility(String direction, String sortBy) {
        this.direction = direction;
        this.sortBy = sortBy;
    }

    @Override
    public int compare(Course c1, Course c2) {

        if(sortBy.equals("fee")) {

            if(direction.equals("ASC")) {
                if(c1.fee > c2.fee)
                    return 1;

                if(c1.fee < c2.fee)
                    return -1;
            }
            else {
                if(c1.fee < c2.fee)
                    return 1;

                if(c1.fee > c2.fee)
                    return -1;
            }
        }
        else if(sortBy.equals("name")) {
            return c1.name.compareTo(c2.name);
        }

        return 0;
    }
}
