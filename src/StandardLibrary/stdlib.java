package StandardLibrary;

public class stdlib {
    public Boolean isPalindrome(String value){
        int size = value.length();
        value = value.toLowerCase();
        for(int i = 0, j = size - 1; i < (size / 2); i++, j--){
            char c = value.charAt(i);
            char d = value.charAt(j);
            if(c != d){
                return false;
            }
        }
        return true;
    }
}
