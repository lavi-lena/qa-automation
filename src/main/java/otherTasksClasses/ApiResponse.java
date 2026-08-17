package otherTasksClasses;

public class ApiResponse {
    int statusCode;
    String body;
    public void isSuccessful(){
        if(statusCode==200){
            System.out.println("Тест пройден");
        }
        else{
            System.out.println("Тест упал с кодом: ["+statusCode+"]");
        }
    }
}
