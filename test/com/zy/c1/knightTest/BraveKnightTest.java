package com.zy.c1.knightTest;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zy.c1.knight.BraveKnight;
import com.zy.c1.knight.Minstrel;
import com.zy.c1.quest.Quest;

public class BraveKnightTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		Minstrel mockMinstrel = mock(Minstrel.class);
		BraveKnight knight = new BraveKnight(mockQuest,mockMinstrel);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}

}
