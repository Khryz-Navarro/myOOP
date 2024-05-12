public class Character {

    private String name;
    private int health = 10;
    private int level = 0;
    private int mana = 5;
    private int attack = 2;

    public void setName(String name) {
        this.name = name;
    }

    public void charAttack() {
        System.out.println(this.name + " Attacked!");
        System.out.println(this.name + " have now " + --attack + " attack");
        if (attack == 0) {
            this.level++;
            System.out.println(this.name + " Leveled Up");
        }
    }

    //use a skill
    public void useFireball() {
        System.out.println(this.name + " used fireball");
        System.out.println(this.name +" have now " + --mana + " mana");
    }

    //check character stats
    public void charStats() {
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Attack: " + this.attack);
        System.out.println("Level: " + this.level);
        System.out.println("Mana: " + this.mana);
    }
    public void checkLevel() {
        System.out.println(this.name + " is now level " + this.level);
    }
    public void checkAttack() {
        System.out.println(this.name + " is now level " + this.level);
    }
    public void checkMana() {
        System.out.println(this.name + " have " + this.mana + " mana");
    }
    public void checkHealth() {
        System.out.println(this.name + " have " + this.health + " health");
    }
    }
