import org.code.neighborhood.*;
public class MountainPainter extends PainterPlus {
  /* Paints one individual row of the mountain, starting with a black
  outline on the left, a gray inside, and a black outline on the right*/
  // squareCount is length of each individual row
  public void paintMountainLine(int squareCount) {
    int lineLength = 0;
    paint("black");
    while (lineLength != (squareCount-2)) {
    move();
    paint("gray");
    lineLength++;
    }
    move();
    paint("black");
    turnAround();
    lineLength = 0;
    while (lineLength != (squareCount-1)) {
      move();
      lineLength++;
    }
    turnRight();
    move();
    turnRight();
  }

  // Makes one of the mountain rows (2 rows total)
  // squareCount is length of each individual row
  public void makeMountainRow(int squareCount) {
    paintMountainLine(squareCount);
    paintMountainLine(squareCount);
    move();
  }

  // Moves painter to starting position
  public void moveToStartingPos() {
    turnRight();
    while (canMove()) {
      move();
    }
    turnLeft();
    while (getX() != 4) {
      move();
    }
  }

  // Paints the full mountain
  public void paintMountain() {
    /* mountainLineCount indicates length of each row, so after each 
    iteration it subtracts 2 until it reaches 2 (length of the peak)*/
    int mountainLineCount = 24;
    while (mountainLineCount != 2) {
      makeMountainRow(mountainLineCount);
      mountainLineCount = mountainLineCount - 2;
    }
    // Paints top outline of mountain
    paint("black");
    move();
    paint("black");
  }
}