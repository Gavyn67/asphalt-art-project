import org.code.neighborhood.*;
public class PainterPlus extends Painter {
  // Turns the painter 180 degrees
  public void turnAround() {
    turnLeft();
    turnLeft();
  }
  
  // Turns the painter right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  
  // Painter takes all paint from the buckets being stood on
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }
  
  // Moves until cannot move
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }
  
  // Paints and moves until no more paint
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }
  
  // Paints in a donut shape
  public void paintDonut(String color) {
    while (hasPaint()){
      turnRight();
      paint("white");
      move();
      paint("white");
      move();
    }
  }
}
