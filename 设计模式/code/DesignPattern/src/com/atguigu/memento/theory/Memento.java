package com.atguigu.memento.theory;

public class Memento {
	private String state;
	//������
	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
