package com.efunzo.be.training;

public class Operators {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		//System.out.println("a++= "+a++);
		//System.out.println("a++= "+ a++);
		
		
	    int b = 10;
		
		//System.out.println("++b= "+ ++b);
		//System.out.println("++b= "+ ++b);
		
		boolean c = false;
		// System.out.println( " c= "+ c);
		// System.out.println( " !c= "+ !c);
		 
		 
		 int t=7, z=2;
		 int k = t%z;
		 
		// System.out.println( " t%Z ="+ (t%z));
		 
		// System.out.println("5>7 "+( 5>7));
		 
		// System.out.println("5<7 "+ (5<7));
		
		// System.out.println("5>=7 "+( 5>= 7));
		// System.out.println("5<=7 "+ (5<=7));
		 
		// System.out.println("5>=5 "+( 5>= 5));
		 
		 //System.out.println("5==5 "+( 5== 5));
		// System.out.println("5!=5 "+( 5!= 5));
		 
		 //&& and || operators 
		 
		 int var1 = 2, var2 = 5;
		 
		 int comp = 0;
		 
		 if(comp < var1 ||  comp ==0) {
			 
			// System.out.print("I am in ");
		 }
		 
			if (var1  > 0 && comp == 0) {

			//	System.out.print("I am in ");
			} else {
			//	System.out.print("I am not in ");
			}
			
			
		int g = (var1 > 0 )? 8:7;
		//System.out.print("g= "+ g);
		
		
		int h = g;
		h+=h;// h= h+h
		h-=h;// h= h-h
		h*=25;//
		h+=40;
		h/=2;
		
		h+=a;
				
		 
		System.out.print(h);
		 
		 
	}

}
