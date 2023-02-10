import java.util.HashMap;

//. Longest Substring Without Repeating Characters

class longestSubstring {
    public static void main(String[] args) {

        String s = "aabcda";//abcd answer

        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0, j=0; i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
             max = Math.max(max,i-j+1);
        }
        System.out.println(max);
    }
}