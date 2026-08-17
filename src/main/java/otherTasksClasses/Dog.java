package otherTasksClasses;

public class Dog extends Pet{

    Dog(String name){
        super(name);

    }
    @Override
    void makeSound(){
        System.out.println("Гав!");
    }
}
