public class Cat extends Pet {

    Cat(String name){
       super(name);
    }
    @Override

    void makeSound(){
        System.out.println("Мяу!");
    }
}
