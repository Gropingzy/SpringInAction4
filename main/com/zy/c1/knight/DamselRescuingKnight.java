package com.zy.c1.knight;

import com.zy.c1.quest.RescueDamselQuest;

public class DamselRescuingKnight implements Knight {
	
	private RescueDamselQuest quest;
	
	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}

	public void embarkOnQuest() {
		quest.embark();
	}

}
