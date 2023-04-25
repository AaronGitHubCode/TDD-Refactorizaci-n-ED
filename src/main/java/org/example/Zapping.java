package org.example;

import java.util.function.Function;

public class Zapping {
	private Function<Integer, Integer> resetClicks = (Integer clicks) -> {
		return clicks <= 0 ? 99 : clicks >= 99 ? 0 : clicks;
	};
	
	private int clicks;
	
	public Zapping(int clicks) {
		this.clicks = clicks;
	}
	
	public int getClicks() {
		return this.clicks;
	}
	
	public void setClicks(int clicks) {
		this.clicks = resetClicks.apply(clicks);
	}
	
	public int countClicksToDestinyUp(int canal) {
		int counter = 0;
		for(getClicks(); getClicks() < canal || getClicks() > canal; setClicks(getClicks() + 1)) {
			if(getClicks() == 99) {
				setClicks(resetClicks.apply(getClicks()));
				counter++;
			}else {
				counter++;
			}
		}
		
		return counter;
	}
	
	public int countClicksToDestinyDown(int canal) {
		int counter = 0;
		
		for(getClicks(); getClicks() < canal || getClicks() > canal; setClicks(getClicks() - 1)) {
			if(getClicks() == 0) {
				setClicks(resetClicks.apply(getClicks()));
				counter++;
			}else {
				counter++;
			}
		}
		
		return counter;
	}
}
