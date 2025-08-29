
public class Main {

    public static void main(String[] args) {
        Polygon polygon = new Polygon();

        polygon.setNumSides(6);       // Example: Hexagon
        polygon.setSideLength(5);     // Each side = 5

        System.out.println("Polygon with " + polygon.getNumSides() + " sides");
        System.out.println("Side length = " + polygon.getSideLength());
        System.out.println("Area = " + polygon.calculateArea());
    }
}
