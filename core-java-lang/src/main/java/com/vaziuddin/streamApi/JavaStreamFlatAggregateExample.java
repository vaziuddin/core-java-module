package com.vaziuddin.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamFlatAggregateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		State karnataka = new State();
		
		karnataka.addCity("Bangalore");
		karnataka.addCity("Mysore");
		
		State punjab = new State();
		punjab.addCity("Chandigarh");
		punjab.addCity("Ludhiana");
		
		List<State> allStates = Arrays.asList(karnataka, punjab);
		List<String> allCities  =allStates.stream().flatMap(e->e.getCities().stream()).collect(Collectors.toList());
		
		System.out.println(allCities);
		
		allCities = new ArrayList<String>();
		for(State state:allStates) {
			for (String city : state.getCities()) {
				allCities.add(city);
				
			}
			
		}
		System.out.println(allCities);
		
		
	}
	}
	
	class State{
		private List<String> cities =new ArrayList<>();
		
		public void addCity(String city) {
			cities.add(city);
		}
		
		public List<String> getCities(){
			return this.cities;
		}
	}


