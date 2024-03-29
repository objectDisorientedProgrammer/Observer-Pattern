package com.sourcemaking;

class Subject
{
	private Observer[] observers = new Observer[9];
	private int totalObs = 0;
	private int state;

	public void attach(Observer o)
	{
		observers[totalObs++] = o;
	}

	public int getState()
	{
		return state;
	}

	public void setState(int in)
	{
		state = in;
		notifyListeners();
	}

	private void notifyListeners()
	{
		for(int i = 0; i < totalObs; i++)
		{
			observers[i].update();
		}
	}
}
