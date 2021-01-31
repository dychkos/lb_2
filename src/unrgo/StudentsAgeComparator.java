package unrgo;

//оголешення класу comparator`a StudentsNameComparator для порівняння поля "age"
public class StudentsAgeComparator {


        public int compare(Students st1, Students st2) {

            Integer ageStudent1 = new Integer(st1.getAge());
            Integer ageStudent2 = new Integer(st2.getAge());


            //ascending order
            return ageStudent1.compareTo(ageStudent2);

            //descending order
            //return fruitName2.compareTo(fruitName1);s
        }
    };

