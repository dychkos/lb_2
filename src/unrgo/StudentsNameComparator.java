package unrgo;

import java.util.Comparator;

//оголешення класу comparator`a StudentsNameComparator для порівняння поля "name"
public class StudentsNameComparator implements Comparator<Students> {

        public int compare(Students st1, Students st2) {

            String nameStudent1 = st1.getName().toUpperCase();
            String nameStudent2 = st2.getName().toUpperCase();

            //ascending order
            return nameStudent1.compareTo(nameStudent2);

            //descending order
            //return fruitName2.compareTo(fruitName1);
        }
    };

