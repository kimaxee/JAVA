package q052;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<GameObject> gameobjs = new ArrayList<>();
		gameobjs.add(new Player("Plyer01", "격투가"));
		gameobjs.add(new Npc("Npc01", "상인"));
		gameobjs.add(new Mob("Mob01", "오크"));
		
		for(GameObject g : gameobjs) {
			g.info();
		}
	}
}
