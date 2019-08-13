package threepointtwo;

 class Person 
{ 
    void message() 
    { 
        System.out.println("This is person class"); 
    } 
} 
  
 class Gaffer extends Person 
{ 
    void message() 
    { 
        System.out.println("This is the gaffer class"); 
    } 
    public void display() 
    { 
        message(); 
  
        super.message(); 
    } 

} 
 public class ThreePointTwo{ 
	 
     public static void main(String args[]) 
     { 
     	
    	 Gaffer s = new Gaffer(); 
    
         s.display(); 
     }


 } 
