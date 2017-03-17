package com.zy.c1.quest;

import java.io.PrintStream;

public class SlayDroganQuest implements Quest {

	private PrintStream stream;	
	
	public SlayDroganQuest(PrintStream stream){
		this.stream = stream;
	}
	
	public void embark() {
		stream.println("Embarking on quest to slay the drogan!");
	}

}
