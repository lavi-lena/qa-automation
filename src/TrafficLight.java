public class TrafficLight {
    Color currentColor = Color.Красный;

    void changeColor(Color newColor){
currentColor = newColor;

        System.out.println("Светофор переключился на: ["+currentColor+"]");
    }
    void canCrossStreet(){
        if(currentColor==Color.Зеленый){
            System.out.println("Можно идти!");
        }
        else{
            System.out.println("Стой и жди!");
        }
    }
}
