public class Abstract {
    abstract class fan{
        public abstract void rotate();
        public void remote(){
            System.out.println("optinal");
        }
    }
    class havels extends fan{
        public void rotate(){
            System.out.print("apple");
        }
    }
    public static void main(String args[]){
        havels havelsFan = new Abstract().new havels();
        havelsFan.rotate();
    }
}
