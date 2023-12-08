import java.util.ArrayList;

public class Interaction {
    private Player player;
    private ArrayList<NPC> NPCs = new ArrayList<>();

    public Interaction(Player player, ArrayList<NPC> NPCs) {
        this.player = player;
        this.NPCs = NPCs;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<NPC> getNPCs() {
        return NPCs;
    }

    public void setNPCs(ArrayList<NPC> NPCs) {
        this.NPCs = NPCs;
    }

    @Override
    public String toString() {
        return "Interaction{" +
                "player=" + player +
                ", NPCs=" + NPCs +
                '}';
    }

    private void outcome (NPC npc) {
        if (npc.isEnemy() && player.getAttackPower() > npc.getHealth()) {
            player.addXP();
        }
    }


}
