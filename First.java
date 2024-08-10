class abc{
    int x=5;
    static int y=10;
    void m1(){
        System.out.println(x);
        System.out.println(y);
    }
    static void m2(int b){
        abc a=new abc();
        System.out.println(a.x);
        System.out.println(abc.y);
        a.m1();
    }
}
class xyz{
    int p=44;
    static int q=66;
    void m3(int a){
        abc apple=new abc();
        System.out.print(apple.x);
        System.out.println(abc.y);
        // ask doubt this commentted portion 
        // xyz z= new xyz();
        // System.out.println(z.p);
        // System.out.println(xyz.q);
    }
    }   
public class First {
    public static void main(String args[]){
        abc b=new abc();
        System.out.println(b.x);
        System.out.println(abc.y);
        b.m1();
        abc.m2(16);
        xyz z= new xyz();
        System.out.println(z.p);
        System.out.println(xyz.q);
    }
}




