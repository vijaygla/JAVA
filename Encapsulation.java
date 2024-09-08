class College {
    private String college_name;
    private int no_of_student;

    // Setter for college_name
    public void setCollegeName(String name) {
        college_name = name;
    }

    // Getter for college_name
    public String getCollegeName() {
        return college_name;
    }

    // Setter for no_of_student
    public void setNoOfStudent(int number) {
        no_of_student = number;
    }

    // Getter for no_of_student
    public int getNoOfStudent() {
        return no_of_student;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        College c = new College();
        c.setCollegeName("GLA");
        c.setNoOfStudent(10);
        System.out.println(c.getCollegeName());
        System.out.println(c.getNoOfStudent());
    }
}
