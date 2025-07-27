package Arrays;

public class SearchInString {

    // TODO: 27/07/25 here i am searching in string for a character

    public static void main(String[] args) {
        String name = "Chirag";
        char target = 'a';
        System.out.println(Search(name,target));
    }

    static boolean Search(String arg, char target){
        for (int i = 0; i<arg.length(); i++){
            char element = arg.charAt(i);
            if (element == target){
                return true;
            }
        }
        return false;
    }
}
