public class ReverseString {
    public static void main(String[] args) {
        String name = "Harshal Teli";
        String reverse= " ";
        String countVowels = " ";
        for(int i=name.length()-1;i>=0;i--){
            reverse += name.charAt(i);
        }
        System.out.println(name);
        System.out.println(reverse);
        for(int i=0;i<name.length()-1;i++){
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countVowels += ch;
            }
        }
        System.out.println(countVowels);
        String revereSed =reverse.replaceAll("[aeiouAEIOU]","");
        System.out.println(revereSed);

    }
}
