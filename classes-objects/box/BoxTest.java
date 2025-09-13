import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

  @Test
  void testBoxWithSpecificDimensions() {
    Box box1 = new Box(2.0, 3.0, 4.0);
    assertEquals(24.0, box1.volume(), 1e-9);
    assertEquals(52.0, box1.surfaceArea(), 1e-9);
    assertEquals(36.0, box1.perimeter(), 1e-9);
  }

  @Test
  void testCubeSingleArgumentConstructor() {
    Box box2 = new Box(5.0);
    assertEquals(125.0, box2.volume(), 1e-9);
    assertEquals(150.0, box2.surfaceArea(), 1e-9);
    assertEquals(60.0, box2.perimeter(), 1e-9);
  }

  @Test
  void testDefaultConstructor() {
    Box box3 = new Box();
    assertEquals(1.0, box3.volume(), 1e-9);
    assertEquals(6.0, box3.surfaceArea(), 1e-9);
    assertEquals(12.0, box3.perimeter(), 1e-9);
  }

  @Test
  void testBoxWithZeroDimension() {
    Box box4 = new Box(0.0, 2.0, 3.0);
    assertEquals(0.0, box4.volume(), 1e-9);
    assertEquals(12.0, box4.surfaceArea(), 1e-9);
    assertEquals(20.0, box4.perimeter(), 1e-9);
  }

  @Test
  void testBoxWithNegativeDimension() {
    Box box5 = new Box(-1.0, 2.0, 3.0);
    assertEquals(-6.0, box5.volume(), 1e-9);
    assertEquals(10.0, box5.surfaceArea(), 1e-9);
    assertEquals(16.0, box5.perimeter(), 1e-9);
  }

  @Test
  void testBoxWithAllZeroDimensions() {
    Box box = new Box(0.0, 0.0, 0.0);
    assertEquals(0.0, box.volume(), 1e-9);
    assertEquals(0.0, box.surfaceArea(), 1e-9);
    assertEquals(0.0, box.perimeter(), 1e-9);
  }

  @Test
  void testBoxWithAllNegativeDimensions() {
    Box box = new Box(-2.0, -3.0, -4.0);
    assertEquals(-24.0, box.volume(), 1e-9);
    assertEquals(52.0, box.surfaceArea(), 1e-9);
    assertEquals(-36.0, box.perimeter(), 1e-9);
  }

  @Test
  void testBoxWithLargeDimensions() {
    Box box = new Box(1e6, 2e6, 3e6);
    assertEquals(6e18, box.volume(), 1e9);
    assertEquals(2 * (1e6 * 2e6 + 2e6 * 3e6 + 3e6 * 1e6), box.surfaceArea(),
                 1e3);
    assertEquals(4 * (1e6 + 2e6 + 3e6), box.perimeter(), 1e-3);
  }

  @Test
  void testBoxWithMixedDimensions() {
    Box box = new Box(1.5, 0.0, -2.5);
    assertEquals(0.0, box.volume(), 1e-9);
    assertEquals(-7.5, box.surfaceArea(), 1e-9);
    assertEquals(-4.0, box.perimeter(), 1e-9);
  }
}

