package otherTasksClasses;

public class WebButton {
    String locator;
    boolean isEnabled;
    public void click(){
        if(isEnabled){
            System.out.print("Клик по элементу ["+locator+"]");
        }
        else{
            System.out.print("Ошибка: кнопка заблокирована!");
        }
    }
}
