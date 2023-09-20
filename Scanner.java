import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;

public class Scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        

        Robot bobbie = new Robot(20,1,East,400);
		
		World.setVisible(true);
		World.setDelay(0);
		World.setSize(20, 20);
    }
}
