package com.efunzo.be.training;

public class Persone {
	
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getLasttName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    public static void main(String[] args) {
		
      Persone persone = new Persone();
    	
       persone.setFirstName("Raymond");
       
       persone.setAge(10);
       
       persone.setLastName("Tatchikou");
        
        System.out.println(persone.getFirstName());
        System.out.println(persone.getAge());
        System.out.println(persone.getLasttName());
    	
	}

}
