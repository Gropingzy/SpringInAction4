package com.zy.c1.knight;

import com.zy.c1.quest.Quest;

public class BraveKnight implements Knight {

	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	
	public void embarkOnQuest() {
		quest.embark();
	}

}
