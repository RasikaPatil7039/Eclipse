package com.aurionpro.model;

public class Train extends Thread {
	Line line;

	public Train(Line line) {
		this.line = line;
	}

	@Override
	public void run() {
		line.getLine();
	}
}
