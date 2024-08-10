class shape {
    void area() {
        System.out.println("display area");
    }
}
class triangle extends shape {
    void area(int b,int h){
        System.out.println((1/2)*b*h);
    }
}
class circle extends shape {
    void area(int r){
    System.out.println(3.14*r*r);
    }
}

public class Inheritance {
    public static void main(String args[]) {
        shape s=new shape();
        s.area();
        triangle t=new triangle();
        t.area(6,12);
        circle c =new circle();
        c.area(8);
    }
}




// extands is a keywords
// extends class_name is used to copy the inheritance property of class_name shape into triangle class and into the circle class.
