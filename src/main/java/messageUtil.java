package pkg;

public class messageUtil {
	 private String NAME;

	   public messageUtil(String input){
	      this.NAME = input; 
	   }

	   public String printMessage(){	      
	      return this.NAME;
	   }   

	   public String salutationMessage(){
		  return ("Hi! " + this.NAME);	   
	   }   
}
