import java.util.*;
//
public class Main {
    // STR stores input STRING
    // CURR stores current SUBSET
    // INDEX stores index in current SUBSET
    static void powerSet(String str,int index,String curr){
        int n = str.length();
        if(index == n){
            // FIRST PRINT CURRENT SUBSET
            System.out.println(curr);
            return;
        }
        // 1 we consider the character as part of current subset
        // 2 we do not consider character as part of current subset
        powerSet(str,index+1,curr+str.charAt(index));
        powerSet(str,index+1,curr);
    }
    public static void main(String[] args) {
        System.out.println("To Find all the Possible Subsets of an String!");
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        int index = 0;
        String curr = " ";
        powerSet(str,index,curr);
    }
}