package actions;

import gui.Gui;
import clocks.GameClocks;

public class Main {

	public static void main(String[] args) {
		Gui g = new Gui();
		GameClocks gc = new GameClocks();
		
		g.create();
		gc.start();
		
	}
}
