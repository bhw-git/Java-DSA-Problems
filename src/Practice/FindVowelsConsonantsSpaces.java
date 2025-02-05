package Practice;

public class FindVowelsConsonantsSpaces {
    public static void main(String[] args){
        String input = "How are you Randii";
        int vowels = 0, consonants = 0, spaces = 0;

        for (int i = 0; i < input.length(); i++) {
            input = input.toLowerCase();
            char c = input.charAt(i);
            if( c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u'){
                vowels++;
            }
            else if( c == ' '){
                spaces++;
            }
            else if( c >= 'a' && c <= 'z'){
                consonants++;
            }
        }
        System.out.println("vowels: " +vowels);
        System.out.println("consonants: " +consonants);
        System.out.println("spaces: " +spaces);
    }
}
