public class triangleMain {

    public static void main(String[] args) {
        triangle triangleA = new triangle(15,8,15,8,17);
        triangle triangleB = new triangle(3,2.598,3,3,3);

        double triangleAArea =  triangleA.findArea();
        System.out.println("Area of Triangle A is  " +triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println("Area of Triangle B is  "+triangleBArea);
    }
}
