package Birdge_Adapter;

import java.util.Calendar;

public class RelogioAtual implements Relogio{

	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}

}
