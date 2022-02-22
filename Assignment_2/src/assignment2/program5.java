package assignment2;
import java.util.*;


public class program5  {
	        void WeightLimitExceeded(int x){
	        System.out.print(Math.abs(15-x)+" kg : ");
	    }
	}


	class Main {
	    void validWeight(int weight) {
	        if(weight>15)
	            System.out.println("weight");
	        else
	            System.out.println("You are ready to fly!");
	    }
	    
	      public static void main (String[] args) {
	        Main ob=new Main();
	        Scanner in=new Scanner(System.in);
	        for(int i=0;i<2;i++){
	            try{
	                ob.validWeight(in.nextInt());
	            }
	            catch
	            (Exception e){
	                System.out.println(e);
	                in.close();
	            }
	        }
	        
		}


}
