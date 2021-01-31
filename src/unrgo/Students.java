

package unrgo;

// класс "Студентів" - Student,який наслідує інтерфейс Comparable для порівняння полів
class Students implements Comparable<Students> {
    private String name;
    private int age;
    private int group;

    public Students(String name, int age, int group) {
        super();
        this.name = name;
        this.age = age;
        this.group = group;
    }

    //геттери для приватних полів
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGroup() {
        return group;
    }

    //Перевантаження toString
    @Override
    public String toString() {
        return "Name: " + name + " age: " + age + " group: " + group;
    }
    //Перевантаження compareTo
    @Override
    public int compareTo(Students st) {

        int stGroup = ((Students) st).getGroup();

        //по зростанню
        return this.group - stGroup;

    }

};

