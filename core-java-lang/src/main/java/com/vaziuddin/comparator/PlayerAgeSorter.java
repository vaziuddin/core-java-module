package com.vaziuddin.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerAgeSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Player> footballTeam = new ArrayList<Player>();
		
		Player player1 = new Player(59, "John", 22);
		Player player2 = new Player(67, "Roger", 20);
		Player player3 = new Player(45, "Steven", 24);
		
		footballTeam.add(player1);
		footballTeam.add(player2);
		footballTeam.add(player3);
		
		System.out.println("Before Sorting : "+footballTeam);
		PlayerAgeComparator playerComparator = new PlayerAgeComparator();
		Collections.sort(footballTeam,playerComparator);
		System.out.println("After Sorting by age : "+footballTeam);
		

	}

}
