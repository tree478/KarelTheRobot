//import javax.swing.*;
//import java.awt.event.*;
import kareltherobot.*;

public class TagTeam implements Directions {

    public static void turnRight(Robot bob){
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
    }

    public static void moveForward(Robot bob){
        bob.move();
        bob.putBeeper();
    }

    public static void climbStairs(Robot bob){
        for(int i=0; i<4; i++){
            bob.putBeeper();
            moveForward(bob);
            moveForward(bob);
            turnRight(bob);
            moveForward(bob);
            moveForward(bob);
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

        for(int i=0; i<4; i++){
            bob.move();
            bob.turnLeft();
            moveForward(bob);
            turnRight(bob);

        }

        for(int i=0; i<4; i++){
            bob.move();
            turnRight(bob);
            moveForward(bob);
            bob.turnLeft();

        }
    }

    public static void thirdMethod(Robot bob){
        for(int i=0; i<5; i++){
            moveForward(bob);
        }
        
        turnRight(bob);
        moveForward(bob);
        moveForward(bob);

        bob.move();
        turnRight(bob);
        moveForward(bob);
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        moveForward(bob);

        bob.turnLeft();
        bob.turnLeft();

        moveForward(bob);
        moveForward(bob);
    }

    public static void goHome(Robot bob){
        for(int i=0; i<3; i++){
            turnRight(bob);
            moveForward(bob);
            bob.turnLeft();
            moveForward(bob);
        }
        bob.turnLeft();
        moveForward(bob);
        moveForward(bob);
        moveForward(bob);
        bob.move();

        bob.turnLeft();
        moveForward(bob);
        bob.turnLeft();
        moveForward(bob);
        turnRight(bob);
        moveForward(bob);

        turnRight(bob);
        for(int i=0; i<5; i++){
            moveForward(bob);
        }
        
        bob.turnLeft();
        moveForward(bob);
        turnRight(bob);
        moveForward(bob);
        moveForward(bob);
        bob.turnLeft();
        moveForward(bob);
        moveForward(bob);
        bob.turnLeft();
        moveForward(bob);
        moveForward(bob);
        moveForward(bob);
        turnRight(bob);
        moveForward(bob);
        moveForward(bob);
        bob.turnLeft();
        moveForward(bob);
        moveForward(bob);
        turnRight(bob);
        moveForward(bob);
        turnRight(bob);
        for(int i=0; i<5; i++){
            moveForward(bob);
        }
        turnRight(bob);
        moveForward(bob);
        moveForward(bob);
        turnRight(bob);
        moveForward(bob);
        moveForward(bob);
        moveForward(bob);
        bob.turnLeft();
        moveForward(bob);
        moveForward(bob);
        bob.turnLeft();
        for(int i=0; i<5; i++){
            moveForward(bob);
        }
        bob.turnLeft();
        for(int i=0; i<4; i++){
            moveForward(bob);
        }
        turnRight(bob);
        for(int i=0; i<7; i++){
            moveForward(bob);
        }


    }
    public static void main(String[] args){
        Robot bob = new Robot(1, 1, North, 400);

        World.setVisible(true);
		World.setDelay(0);
		World.setSize(20, 25);

        climbStairs(bob);
        makePeak(bob);
        turnRight(bob);
        World.setDelay(10);
        thirdMethod(bob);
        System.out.println(bob.direction());
        goHome(bob);
    }
}