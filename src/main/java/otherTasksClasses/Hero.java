package otherTasksClasses;

public class Hero {
    String name;
    int baseAttack;
    Sword equippedSword;

    Hero(String name,int baseAttack){
        this.name = name;
        this.baseAttack = baseAttack;
    }
    void hitEnemy(){
       int sum = baseAttack + equippedSword.damage;
        System.out.println("Герой ["+name+"] наносит ["+sum+"] урона!");
    }
}
