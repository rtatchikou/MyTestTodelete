package com.efunzo.be.training;

public class Calculator {
	
	
	public static void main(String[] args) {
		
		if(args.length == 3) {
			
			int  opt1= Integer.parseInt(args[0]);
			String opt2 = args[1];
			int opt3 = Integer.parseInt(args[2]);
			
			if("+".equals(opt2)) {
				
				System.out.println(opt1+"="+opt3+"="+(opt1 + opt3));
			}else if ("x".equals(opt2)) {
				
				System.out.println(opt1+"*"+opt3+"="+(opt1 * opt3));
				
				
			}else if ("/".equals(opt2)) {
				
				System.out.println(opt1+"/"+opt3+"="+(opt1 / opt3));
			}
            else if ("-".equals(opt2)) {
				
				System.out.println(opt1+"-"+opt3+"="+(opt1 - opt3));
			}
		}else {
			
			System.out.println("Error 3 arguments are needed");
		}
		
	}

}
