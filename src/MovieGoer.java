public class MovieGoer {
    String name;
    int age;
    MovieGoer(String name,int age){
        this.name = name;
        this.age = age;

    }
    static void checkTicket(MovieGoer person){
        String answer = (person.age >= 18)? "Пропускаем" : "Билет аннулирован, фильм для взрослых";
        System.out.println(answer);
    }
}
