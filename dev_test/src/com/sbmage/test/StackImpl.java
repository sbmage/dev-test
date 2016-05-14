package com.sbmage.test;

public class StackImpl implements Stack{
	
	private int top = -1;
	private int stackSize;
	private char StackArray[];
	
	public StackImpl(int stackSize){
		this.stackSize = stackSize;
		StackArray = new char[this.stackSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (top == this.stackSize - 1);
	}

	@Override
	public void push(char c) {
		// TODO Auto-generated method stub
		if (isFull()) {
			System.out.println("Full");
		} else {
			StackArray[++top] = c;
		}
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if (isEmpty()){
			System.out.println("empty");
			return 0;
		} else 
			return StackArray[top--];
	}

}
