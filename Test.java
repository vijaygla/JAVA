class algebra {
    void method_1(int x){
        System.out.println(x*x);
        System.out.println(x+x);
    }
    void method_2(float f){
        System.out.println(f*f);
        System.out.println(f+f);
    }
}
public class Test{
    public static void main(String args[]){
        algebra a=new algebra();
        a.method_1(5);
        System.out.print("\n");
        a.method_2(4.5f);
    }
}
