import java.util.Arrays;

public class longestPrefix {
    public static void main(String[] args) {
        String[] s = { "abcd", "abc", "ab" };
        Arrays.sort(s);//first sorting the array list into ascending order
        int c = 0;
        String first = s[0]; //initializing the prefix array to compare
        String last = s[s.length - 1]; //last array

        while (c < first.length()) { //loop runs until the length of the shortest array because that is what we are comparing with
            if (first.charAt(c) == last.charAt(c)) {//the two charac are equal increase the counter
                c++;
            }

        }
        String result = c == 0 ? "" : first.substring(0, c);
        //if 0 then return blank else characters from 0 to c
        System.out.println(result);
    }

}
