import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String name ="Harshal";
        char result = FrequenctCount(name);

        if(result != 0){
            System.out.println("First Unique Character is" + " "  + result);
        }
        else {
            System.out.println("No Unique character is found");
        }
}
    private static char FrequenctCount(String name) {
        int[] count = new int[256];

        for(int i=0;i<name.length();i++){
            char ch = Character.toLowerCase(name.charAt(i));
            count[ch] ++;
        }

        for(int i=0; i<name.length() ;i++){
            char ch = Character.toLowerCase(name.charAt(i));
            if(count[ch] == 1 ){
                return name.charAt(i);
            }
        }
        return 0;
    }

}
