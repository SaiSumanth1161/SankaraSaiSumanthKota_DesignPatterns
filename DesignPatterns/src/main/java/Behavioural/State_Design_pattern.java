package Behavioural;

public class State_Design_pattern {
	public static void main(String[] args)  
    { 
        StateContext state = new StateContext(); 
        state.alert();  
        state.setState(new Silent()); 
        state.alert();         
    } 

}
