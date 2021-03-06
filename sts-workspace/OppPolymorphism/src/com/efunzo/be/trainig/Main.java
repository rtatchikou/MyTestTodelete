package com.efunzo.be.trainig;

public class Main {
	
	public static Movie randomMovie() {
		
		int ran =(int) (Math.random() * 7)+1;
		System.out.println("Random number generated was: "+ ran);
		
		switch (ran) {
			case 1:
				return new Jaws();
			case 2:
				return new IndependanceDay();
			case 3:
				return new MazeRunner();
			case 4:
				return new StarsWars();
			case 5:
				return new TheMasque();
			case 6:
				return new Forgetable();
			case 7:
				return new Friends();
		
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
	for (int i = 1; i < 8; i++) {
		
		Movie movie = randomMovie();
		
		System.out.println("Movie # " +i+ " : "+ movie.getName()+ "\n" +
		"Description:  "+ movie.getDescription() + "\n" 
		+ "Duration: "+ movie.getDuration() + "\n");
		
	}
	}

}
