import java.util.HashMap;
import java.util.Map;

class RomanToInt {
    public static void main(String[] args) {
        String s = "XIV";

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        int sum = 0;
        int now = map.get(s.charAt(0));
        int next = 0;
        for (int i = 1; i < s.length(); i++) {
            next = map.get(s.charAt(i));
            if (next > now) {
                sum -= now;
            } else {
                sum += now;
            }
            now = next;
        }
        System.out.println(sum+now);//sum+now for adding the last digit in the map

    }
}
