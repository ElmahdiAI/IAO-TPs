// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        ShapeFactory factory = new ShapeFactory();

        Shape square = factory.createShape("square");
        square.draw();

        Shape circle = factory.createShape("circle");
        circle.draw();

        Shape hexagon = factory.createShape("hexagon");
        hexagon.draw();
    }
}