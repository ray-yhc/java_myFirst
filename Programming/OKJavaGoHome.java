import org.opentutorials.iot.*; 

public class OKJavaGoHome {

	public static void main(String[] args) {
        
        String id = "the Sharp 804";
        
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
        
		//Security off
        Security mySecurity = new Security(id);
        mySecurity.off();
		
		//Light on
        Lighting hallLamp = new Lighting(id+" / hallLamp");
        hallLamp.on();
        
        
	}

}
