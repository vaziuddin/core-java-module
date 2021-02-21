package com.vaziuddin.comparator;

import java.util.Comparator;

public class PlayerAgeComparator implements Comparator<Player> {

	@Override
	public int compare(Player firstPlayer, Player secondPlayer) {
		// TODO Auto-generated method stub
		return Integer.compare(firstPlayer.getAge(), secondPlayer.getAge());
	}

}
