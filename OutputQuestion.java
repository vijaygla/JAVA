public class OutputQuestion { 
 int x = 10; 
 int y = 5; 
 public int addNumbers(int a, int b) 
 { 
 return a + b; 
 } 
 public int multiplyNumbers(int a, int b) 
 { 
 return a * b; 
 } 
 public static void main(String[] args) 
 { 
 OutputQuestion obj = new OutputQuestion(); 
 int result1 = obj.addNumbers(obj.x, obj.y); 
 int result2 = obj.multiplyNumbers(obj.x, obj.y); 
 int sum = obj.addNumbers(result1, result2); 
 System.out.println("Sum of the results: " + sum); 
 } 
}



// OUTPUT 
// Sum of the result: 65