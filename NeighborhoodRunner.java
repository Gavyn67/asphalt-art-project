import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    /* Instantiates SunsetPainter and paints
    the sunset sky in a gradient*/
    SunsetPainter joe = new SunsetPainter();
    joe.paintSunset();
    
    /* Instantiates MountainPainter and paints mountain 
    infront of the sunset sky */
    MountainPainter mark = new MountainPainter();
    // Moves mountainPainter to starting position
    mark.moveToStartingPos();
    // Paints mountain
    mark.paintMountain();
  }
}