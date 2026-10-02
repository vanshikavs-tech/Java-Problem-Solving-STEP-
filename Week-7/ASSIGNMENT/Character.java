package Week-7.ASSIGNMENT;

class Character {
    private int health;
    private final int maxHealth;

    Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public int getHealth() {
        return health;
    }
}