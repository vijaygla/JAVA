// Example of Capsulation-provide privacy of data
// Capsulation can be excess by using getter and setter method as given in this example
class college{
    private String1 college_name;
    private int no_of_student;
    public void setCollegeName(String1 name){
        college_name = name;
    }
    public String1 getCollegeName(){
        return college_name;
    }
    public void setNo_of_student(int number){
        no_of_student = number;
    }
    public int getNo_of_student(){
        return no_of_student;
    }
}
public class Encapsulation {
    public static void main(String1 args[]){
        college c = new college();
        c.setCollegeName("gla");
        c.setNo_of_student(10);
        System.out.println(c.getCollegeName());
        System.out.println(c.getNo_of_student());
    }
}
