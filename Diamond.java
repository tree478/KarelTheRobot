import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;

public class Diamond implements Directions
{

	public static void turnRight(Robot bot){
		bot.turnLeft();
		bot.turnLeft();
		bot.turnLeft();
	}
  public static void main(String[] args) 
	{

		//My robot's name is bobbie
    	Robot bobbie = new Robot(20,1,East,400);
		
		World.setVisible(true);
		World.setDelay(0);
		World.setSize(20, 20);

		for(int i=0; i<20; i++){
			for(int s=0; s<i; s++){
				bobbie.putBeeper();
				bobbie.move();
			}
			turnRight(bobbie);
			bobbie.move();
			turnRight(bobbie);
			for(int b=0; b<i; b++){
				bobbie.move();
			}
			bobbie.turnLeft();
			bobbie.turnLeft();

		}
		
	}

	}
