public class Demo {
    int m1(int x){
        System.out.println(x);
        return x;
    }
    void m1(){
        System.out.print("hello");
    }
    public static void main(String args[]){
        Demo d=new Demo();
        int z=d.m1(5);
        System.out.println(z);
    }
}



