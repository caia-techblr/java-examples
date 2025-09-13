package point;

enum Quadrant {
    FIRST, SECOND, THIRD, FOURTH, ORIGIN, X_AXIS, Y_AXIS
}

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceFromOther(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    public Quadrant getQuadrant() {
        if (x == 0 && y == 0) {
            return Quadrant.ORIGIN;
        } else if (x == 0) {
            return Quadrant.Y_AXIS;
        } else if (y == 0) {
            return Quadrant.X_AXIS;
        } else if (x > 0 && y > 0) {
            return Quadrant.FIRST;
        } else if (x < 0 && y > 0) {
            return Quadrant.SECOND;
        } else if (x < 0 && y < 0) {
            return Quadrant.THIRD;
        } else {
            return Quadrant.FOURTH;
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
} 