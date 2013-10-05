package com.sourcemaking;

class BinObserver extends Observer
{
	public BinObserver(Subject s)
	{
		subj = s;
		subj.attach(this);
	} // Observers register themselves

	public void update()
	{
		System.out.print(" " + Integer.toBinaryString(subj.getState()));
	}
}