public class Person {
    String name;
    String lastname;
    Passport passport;
    

    public Person(String name, String initialLastname){
        this.name = name;
        lastname = initialLastname;
    }
    public void showDocuments(){
        if(passport!=null){
            System.out.println("Человек: ["+name+"], Номер паспорта: ["+passport.number+"]");
        }
    }

}
