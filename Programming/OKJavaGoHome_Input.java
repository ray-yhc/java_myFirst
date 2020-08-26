import org.opentutorials.iot.*; 
import javax.swing.JOptionPane;

public class OKJavaGoHome_Input {

	public static void main(String[] args) {
        
        String id = JOptionPane.showInputDialog("Enter a path");
        
        /////미완성//////
        
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
