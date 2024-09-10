public class Main {
    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(4, 6)};
        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}
