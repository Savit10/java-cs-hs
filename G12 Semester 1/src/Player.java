public class Player extends GameCharacter{
    private int xp;

    public Player(String name, int health, int attackPower, int xp) {
        super(name, health, attackPower);
        this.xp = xp;
    }

    public void addXP()
    {
        this.xp++;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return super.toString() + "Player{" +
                "xp=" + xp +
                '}';
    }
}
