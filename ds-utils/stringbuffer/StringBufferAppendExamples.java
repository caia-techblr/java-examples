class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box(double len) {
        this(len, len, len);
    }
    Box() {
        this(1.0, 1.0, 1.0);
    }

    double volume() {
        return width * height * depth;
    }

    double surfaceArea() {
        return 2 * (width * height + height * depth + depth * width);
    }
       
    double perimeter() {
        return 4 * (width + height + depth);
    }
    public String toString() {
        return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
    }
}
public class StringBufferAppendExamples {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sb);

        // Append a string literal
        sb.append(" World");
        System.out.println("After appending ' World': " + sb);

        // Append a string variable
        String str = "abcd";
        sb.append(str);
        System.out.println("After appending 'abcd': " + sb);

        // Append an integer
        sb.append(2024);
        System.out.println("After appending 2024: " + sb);

        // Append a character
        sb.append('!');
        System.out.println("After appending '!': " + sb);

        // Append a boolean
        sb.append(true);
        System.out.println("After appending true: " + sb);

        // Append a double
        sb.append(3.14);
        System.out.println("After appending 3.14: " + sb);

        // Append an object (Box)      
        Box b1 = new Box(2.0, 3.0, 4.0);
        sb.append(b1);
        System.out.println("After appending Box object: " + sb);

        //TODO: Append other types like float, long, char array, etc.
        //TODO: CharSequence, StringBuffer, StringBuilder
        //TODO: Append null
        //TODO: Append with offset and length from char array and String
        //TODO: Append objects implementing CharSequence
        //TODO: Append code points
        //TODO: Method chaining with append
        

           
        
    }
}
