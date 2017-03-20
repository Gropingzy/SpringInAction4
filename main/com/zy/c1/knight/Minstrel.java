package com.zy.c1.knight;

import java.io.PrintStream;

public class Minstrel {
	private PrintStream stream;
	
	public void Mistrel(PrintStream stream){
		this.stream = stream;
	}
	
	public void singBeforeQuest(){
		stream.println("Fa la la, the knight is so brave!");
	}
	
	public void singAfterQuest(){
		stream.println("Tee hee hee, the beave knight did embark on a quest!");
	}
	
}
