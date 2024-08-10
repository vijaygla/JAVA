class pen {
    String colour;
    String type;

    void write(){
        System.out.println("Write Somethings");
    }
    void colour_name(){
        System.out.println(this.colour);
    }
    void types(){
        System.out.println(this.type);
    }
}
public class Fun {
    public static void main(String args[]) {
        pen p1=new pen();
        p1.write();
        p1.colour="Red Pen";
        p1.type="ball pen";
        p1.colour_name();
        p1.types();

        System.out.println();
        
        pen p2=new pen();
        p2.colour="Blue Pen";
        p2.type="Gel Pen";
        p2.colour_name();
        p2.types();
    }
}


