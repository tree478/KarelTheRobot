import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;

public class TagTeam implements Directions {

    public static void turnRight(Robot bob){
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
    }

    public static void climbStairs(Robot bob){
        for(int i=0; i<4; i++){
            bob.putBeeper();
            bob.move();
            bob.putBeeper();
            bob.move();
            bob.putBeeper();
            turnRight(bob);
            bob.move();
            bob.putBeeper();
            bob.move();
            bob.putBeeper();
            bob.putBeeper();
            bob.move();
            bob.turnLeft();
        }

        System.out.println("Finished climbStairs()");
    }

    public static void makePeak(Robot bob){
        turnRight(bob);
        bob.putBeeper();
        turnRight(bob);
        
        bob.turnLeft();
        for(int i=0; i<3; i++){
            bob.move();
            turnRight(bob);
            bob.move();
            bob.putBeeper();
            bob.turnLeft();

        }

        bob.turnLeft();
        bob.move();
        bob.putBeeper();
        bob.move();
        bob.putBeeper();

        for(int i=0; i<3; i++){
            bob.move();
            bob.turnLeft();
            bob.move();
            bob.putBeeper();
            turnRight(bob);

        }

    }

    public static void thirdMethod(Robot bob){
        for(int i=0; i<5; i++){
            bob.move();
            bob.putBeeper();
        }
        
        turnRight(bob);
        bob.move();
        bob.putBeeper();
        bob.move();
        bob.putBeeper();

        bob.move();
        turnRight(bob);
        bob.move();
        bob.putBeeper();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.putBeeper();

        bob.turnLeft();
        bob.turnLeft();

        bob.move();
        bob.putBeeper();
        bob.move();
        bob.putBeeper();
    }

    public static void main(String[] args){
        Robot bob = new Robot(1, 1, North, 400);

        World.setVisible(true);
		World.setDelay(0);
		World.setSize(15, 20);

        climbStairs(bob);

        World.setDelay(10);

        // bob.turnLeft();
        // bob.turnLeft();
        // for(int i=0; i<8; i++){
        //     bob.move();
        // }
        // bob.turnLeft();
        // bob.turnLeft();
        makePeak(bob);

        thirdMethod(bob);
    }
}
