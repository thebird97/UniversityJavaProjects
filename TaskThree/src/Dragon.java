
package labyrinth;

import java.awt.Image;
import java.util.Random;


public class Dragon extends Sprite {

    private double velx;
    private double vely;


Random generator = new Random();
int randomIndex = generator.nextInt( 10 ) - 1;

    public Dragon(int x, int y, int width, int height, Image image) {
        super(x, y, width, height, image);
        velx = 1;
        vely = 1;
    }

    public void moveX() {
      
      if (randomIndex>5){
           x += velx;
       }else{
        x -= velx;
       }
        if (x + width >= 800 || x <= 0) {
            invertVelX();
        }
    }

    public boolean moveY() {
       if (randomIndex<5){
           y += vely;
       }else{
           y -= vely;
       }
        
        
        if (y <= 0) {
            invertVelY();
        }
        if (y >= 600) {
            return false;
        }
        return true;
    }

    public void invertVelX() {
        velx = -velx;
       
     
    }

    public void invertVelY() {
        vely = -vely;
          

    }

    public double getVelx() {
        return velx;
    }

    public double getVely() {
        return vely;
    }

    public Random getGenerator() {
        return generator;
    }

    public int getRandomIndex() {
        return randomIndex;
    }
    
    
}