package unrgo;
//дочірній класс "Дерева" - Tree
public class Tree extends Plant{
    //статичний ініціалізатор(буде виликаний при першому звертанні до классу)
    static {
        System.out.println("Static initial");

    }

    //звичайний ініціалізатор(буде виликаний після виклику super())
    {
        System.out.println("Default init");
    }

    //перевантаження конструктора
    public Tree(String name, String areal, int age) {
        super(name, areal, age);
        System.out.println("Child Tree constructor");
    };

    //перевантаження батьківського методу
    @Override
    public boolean isGrowing() {
        if(age>10){
            return false;
        }
        return true;
    }
}
