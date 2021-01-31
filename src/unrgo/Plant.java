package unrgo;
//батьківський класс "Рослини" - Plant
public class Plant {
    String name;
    String areal;
    int age;
    public Plant(String name,String areal, int age){
        this.name=name;
        this.age=age;
        this.areal=areal;
        System.out.println("Parent constructor");

    }
    public boolean isGrowing(){
        if(age>1){
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return "Name: "+name+" areal "+areal+" age "+ age;

    }

}
