import org.code.neighborhood.*;
public class SunsetPainter extends PainterPlus {
  // Paints an individial line with a specified color
  public void paintLine(String color) {
    while (canMove()) {
      paint(color);
      move(); 
    }
    paint(color);
  }

  // Paints four rows going down with a specified color
  public void paintFourLines(String color) {
    paintLine(color);
    turnRight();
    move();
    turnRight();
    paintLine(color);
    turnLeft();
    move();
    turnLeft();
    paintLine(color);
    turnRight();
    move();
    turnRight();
    paintLine(color);
    if (canMove("South")) {
    turnLeft();
    move();
    turnLeft();
    }
  }

  // Paints the entire sunset in a gradient pattern from yellow --> dark purple
  public void paintSunset() {
    paintFourLines("#FFEB3B"); // Paints four lines in the color #FFEB3B (Bright Yellow)
    paintFourLines("#FFC107"); // Paints four lines in the color #FFC107 (Amber)
    paintFourLines("#FF9800"); // Paints four lines in the color #FF9800 (Orange)
    paintFourLines("#FF5722"); // Paints four lines in the color #FF5722 (Deep Orange)
    paintFourLines("#E91E63"); // Paints four lines in the color #E91E63 (Pinkish Red)
    paintFourLines("#9C27B0"); // Paints four lines in the color #9C27B0 (Purple)
    paintFourLines("#673AB7"); // Paints four lines in the color #673AB7 (Deep Purple)
    paintFourLines("#4A148C"); // Paints four lines in the color #4A148C (Dark Purple)
  }
}