public class NPC extends GameCharacter {
    private boolean isEnemy;

    public NPC(String name, int health, int attackPower, boolean isEnemy) {
        super(name, health, attackPower);
        this.isEnemy = isEnemy;
    }

    public boolean isEnemy() {
        return isEnemy;
    }

    public void setEnemy(boolean enemy) {
        isEnemy = enemy;
    }

    @Override
    public String toString() {
        return super.toString() + "NPC{" +
                "isEnemy=" + isEnemy +
                '}';
    }
}
