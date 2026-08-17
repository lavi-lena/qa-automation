package otherTasksClasses;

public class LoginPage {
    String url = "https://mysite.com";
    String username;
    String password;

    public void login(String username, String password){
    System.out.println("Переходим на ["+url+"]. Вводим логин ["+username+"] и пароль ["+password+"]. Нажимаем Войти.");
    this.username=username;
    this.password=password;

}
public void displayUsernameAndPassword(){
        System.out.println(username+","+password);
}
}
