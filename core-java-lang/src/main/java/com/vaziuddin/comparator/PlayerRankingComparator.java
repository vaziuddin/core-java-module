package com.vaziuddin.comparator;

import java.util.Comparator;

public class PlayerRankingComparator implements Comparator<Player>{
	
	public int compare(Player firstplayer, Player secondPlayer) {
		return Integer.compare(firstplayer.getRanking(), secondPlayer.getRanking());
	}

}
