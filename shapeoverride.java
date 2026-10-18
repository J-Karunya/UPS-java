import java.util.Scanner;

abstract class shapes{
    abstract double area();
}
class circle extends shapes{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    @Override 
    double area(){
        return Math.PI*radius*radius;
    }
}
class triangle extends shapes{
    double height;
    double breadth;
    triangle(double height,double breadth){
        this.height=height;
        this.breadth=breadth;
    }
    @Override 
    double area(){
        return 0.5*height*breadth;
    }
}
class rectangle extends shapes{
    double height;
    double width;
    rectangle (double height,double width){
        this.height=height;
        this.width=width;
    }
    @Override 
    double area(){
        return height*width;
    }
}
class shapeoverride{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double rad=sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double ht=sc.nextDouble();
        System.out.print("Enter breadth of triangle: ");
        double bt=sc.nextDouble();
        System.out.print("Enter height of rectangle: ");
        double hr=sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double br=sc.nextDouble();
        shapes[] arr={new circle(rad),new rectangle(hr,br),new triangle(ht,bt)};

        System.out.printf("Area of circle is: %.2f%n", arr[0].area());
        System.out.println("Area of rectangle is: "+ arr[1].area());
        System.out.println("Area of triangle is: "+ arr[2].area());
        

    }
}