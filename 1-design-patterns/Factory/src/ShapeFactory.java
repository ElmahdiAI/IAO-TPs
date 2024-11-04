public class ShapeFactory {
    public Shape createShape(String type) throws Exception {
        switch (type.toLowerCase()) {
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
            case "circle":
                return new Circle();
            case "hexagon":
                return new Hexagon();
            default:
                throw new Exception("Shape type not reconized");
        }
    }
}
