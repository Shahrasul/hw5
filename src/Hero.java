public class Hero {
    private int damage;
    private int health;
    private String superAbility;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public Hero(int damage, int health, String superAbility) {
        this.damage = damage;
        this.health = health;
        this.superAbility = superAbility;
    }

    public Hero(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }
}
