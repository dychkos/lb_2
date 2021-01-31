package unrgo;
//дочірній класс "Квіти" - Flower

public class Flower extends Plant{

    //перевантаження конструктора
    public Flower(String name, String areal, int age) {
        super(name, areal, age);
        System.out.println("Child Flower constructor");
    }

    //перевантаження батьківського методу
    @Override
    public boolean isGrowing() {
        if(age>0.3){
            return false;
        }
        return true;
    }
}
