package com.efunzo.be.training;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Animal", 1, 1, 1, 60);
		
		Dog dog = new Dog("Medor", 1, 20, 2, 4, "bark", 20, 1);
		
		//dog.eat();
		//dog.move();
		
		//dog.move(5);
		//dog.move(11);
		
		 int[][] arr = { {10,39,8},{3,11,6},{35,12,87},{22,12,34} };
		 
		 for (int i = 0; i < 4; i++) {
			 
			 for (int j = 0; j < 3; j++) {
					
				 if(arr[i][j]==8 ||arr[i][j]==34 || arr[i][j]==87 || arr[i][j]==3 ) {
					 
					 System.out.println(arr[i][j]);
				 }
				}
		}

	}

}
