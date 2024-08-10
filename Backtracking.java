// JAVA PROGRAM TO PRINT THE ALL POSSIBLE COMBINATION OF "ABC" BY USING THE BACKTRACKING AND RECURRSSION.
public class Backtracking {
    public static void printpermutation(String str, String permu,int index){
        if(str.length() ==0){
            System.out.println(permu);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printpermutation(
                newStr, permu + currChar, index+1);
        }
    }
    public static void main(String[] args) {
        String str ="ABC";
        printpermutation(str, "", 0);
    }
}




// JAVA PROGRAM TO PRINT THE N-QUEEN QUESTION IN CHESS BOARD SIZE IS N*N AND PRINT ALL THE POSSIBLE COMBINATION WHERE QUEEN IS SAFE.
// public class Backtracking {
//     if (){

//     }
//     public static void printQueen(String str,int index,int list[])
//     public static void main(String[] args) {
        
//     }
// }
