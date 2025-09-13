import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

package point;

public class PointTest {

  @Test
  void testConstructorAndGetters() {
    Point p = new Point(3, 4);
    assertEquals(3, p.getX(), "getX failed");
    assertEquals(4, p.getY(), "getY failed");
  }

  @Test
  void testDistanceFromOrigin() {
    Point p = new Point(3, 4);
    assertEquals(5.0, p.distanceFromOrigin(), 1e-9,
                 "distanceFromOrigin failed");
    Point origin = new Point(0, 0);
    assertEquals(0.0, origin.distanceFromOrigin(), 1e-9,
                 "distanceFromOrigin at origin failed");
    Point negative = new Point(-6, -8);
    assertEquals(10.0, negative.distanceFromOrigin(), 1e-9,
                 "distanceFromOrigin negative failed");
  }

  @Test
  void testDistanceFromOther() {
    Point p1 = new Point(3, 4);
    Point p2 = new Point(0, 0);
    assertEquals(5.0, p1.distanceFromOther(p2), 1e-9,
                 "distanceFromOther failed");
    Point p3 = new Point(3, 0);
    assertEquals(4.0, p1.distanceFromOther(p3), 1e-9,
                 "distanceFromOther failed");
    assertEquals(0.0, p1.distanceFromOther(p1), 1e-9,
                 "distanceFromOther same point failed");
    Point p4 = new Point(-3, -4);
    assertEquals(10.0, p1.distanceFromOther(p4), 1e-9,
                 "distanceFromOther negative failed");
  }

  @Test
  void testGetQuadrant() {
    assertEquals(Quadrant.FIRST, new Point(3, 4).getQuadrant(),
                 "getQuadrant FIRST failed");
    assertEquals(Quadrant.SECOND, new Point(-2, 5).getQuadrant(),
                 "getQuadrant SECOND failed");
    assertEquals(Quadrant.THIRD, new Point(-1, -1).getQuadrant(),
                 "getQuadrant THIRD failed");
    assertEquals(Quadrant.FOURTH, new Point(2, -3).getQuadrant(),
                 "getQuadrant FOURTH failed");
    assertEquals(Quadrant.ORIGIN, new Point(0, 0).getQuadrant(),
                 "getQuadrant ORIGIN failed");
    assertEquals(Quadrant.Y_AXIS, new Point(0, 7).getQuadrant(),
                 "getQuadrant Y_AXIS failed");
    assertEquals(Quadrant.X_AXIS, new Point(5, 0).getQuadrant(),
                 "getQuadrant X_AXIS failed");
    assertEquals(Quadrant.Y_AXIS, new Point(0, -5).getQuadrant(),
                 "getQuadrant Y_AXIS negative failed");
    assertEquals(Quadrant.X_AXIS, new Point(-8, 0).getQuadrant(),
                 "getQuadrant X_AXIS negative failed");
  }

  @Test
  void testToString() {
    assertEquals("(3, 4)", new Point(3, 4).toString(), "toString failed");
    assertEquals("(0, 0)", new Point(0, 0).toString(),
                 "toString origin failed");
    assertEquals("(-5, 7)", new Point(-5, 7).toString(),
                 "toString negative failed");
  }
}
}
}