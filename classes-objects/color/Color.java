package color;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = clamp(red);
        this.green = clamp(green);
        this.blue = clamp(blue);
    }

    public Color invert() {
        return new Color(255 - red, 255 - green, 255 - blue);
    }

    private int clamp(int value) {
        return Math.max(0, Math.min(255, value));
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String toHex() {
        return String.format("#%02X%02X%02X", red, green, blue);
    }

    @Override
    public String toString() {
        return "Color(" + red + ", " + green + ", " + blue + ")";
    }   
}
