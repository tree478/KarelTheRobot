import kareltherobot.*;

public class testPractice implements Directions { 
    //don't forget "implements directions"! Otherwise the robot you create will not work properly(the direction variable will be undefined)
    public static void turnRight(Robot bob){
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
    }

    public static void main(String[] args){
        Robot bob = new Robot(1, 1, North, 400);

        World.setVisible(true);
        World.setDelay(0);
        World.setSize(20, 20);

        turnRight(bob);
        bob.move();
        bob.putBeeper();
        bob.move();
        bob.putBeeper();

        for(int i=0; i<4; i++){
            bob.turnLeft();
            bob.move();
            bob.putBeeper();
            turnRight(bob);
            bob.move();
            bob.putBeeper();
        }
    }
}
