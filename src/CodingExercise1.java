import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot rob = new Robot();
    	rob.penDown();
   	 // 3. ask the user what color they would like the Robot to draw
    	String color = JOptionPane.showInputDialog("What color do you want to draw?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if(color.equals("red")) {
    		rob.setPenColor(255,0,0);
    	}
    	else if(color.equals("green")) {
    		rob.setPenColor(17, 187, 119);
    	}
   	 // 2. set the pen width to 10
    	rob.setPenWidth(10);
   	 // 1. make the Robot draw a shape
    	for (int i = 0; i < 4; i++) {
    	   	 rob.move(50);
    	   	 rob.turn(90);
		}

    }

}
