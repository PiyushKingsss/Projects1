package text;

class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 


public class accessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 


	}

}

