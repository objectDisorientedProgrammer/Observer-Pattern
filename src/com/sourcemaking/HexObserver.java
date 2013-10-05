package com.sourcemaking;

class HexObserver extends Observer
{
	public HexObserver(Subject s)
	{
		subj = s;
		subj.attach(this);
	}

	public void update()
	{
		System.out.print(" " + Integer.toHexString(subj.getState()));
	}
} // Observers "pull" information