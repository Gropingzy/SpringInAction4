package com.zy.c1.knight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zy.c1.knight.Knight;
import com.zy.c1.knight.BraveKnight;
import com.zy.c1.quest.Quest;
import com.zy.c1.quest.SlayDroganQuest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight(){
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest(){
		return new SlayDroganQuest(System.out);
	}
}
