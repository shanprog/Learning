package ch_13.lst_01_04;

public class TestGeometricObject {

    public static void main(String[] args) {
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.println(("The two objects have the same area? " + equalArea(geoObject1, geoObject2)));

        displayGeometricObject(geoObject1);
        displayGeometricObject(geoObject2);
    }

    private static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());

    }

    private static boolean equalArea(GeometricObject geoObject1, GeometricObject geoObject2) {
        return geoObject1.getArea() == geoObject2.getArea();
    }


}
