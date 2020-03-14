package Behavioural;

public class StateContext {
	    private MobileState state; 
	  
	    public StateContext()  
	    { 
	        state=new Vibration(); 
	    } 
	    public void setState(MobileState state)  
	    { 
	        this.state=state; 
	    } 
	    public void alert()  
	    { 
	        state.alert(this); 
	    } 
	} 
