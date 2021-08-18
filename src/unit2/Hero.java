package unit2;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    int age;
    int attackSpeed;
    
    void keng(){
    	System.out.println("kengduiyou!");
    }
    void ledendary(){
    	System.out.println("woshishen!");
    }
    float getArmor(){
    	return armor;
    }
    float getHp(){
    	return hp;
    }
    void addSpeed(int speed){
    	speed = moveSpeed + speed;
    }
    void recovery(float blood){
    	hp = hp + blood;
    }
    
public static void main(String[] args) {
	Hero garen = new Hero();
	garen.name = "gailun";
	garen.age = 20;
	garen.hp = 616.28f;
	garen.armor = 27.536f;
	garen.moveSpeed = 350;
    garen.attackSpeed = 200;
    garen.addSpeed(100);
    
	Hero teemo = new Hero();
	teemo.name = "timo";
	teemo.age =30;
	teemo.hp = 383f;
	teemo.armor = 14f;
	teemo.moveSpeed = 330;
	teemo.attackSpeed = 340;
}
}
//!@#$%^&*() 
//half of them is written by myself