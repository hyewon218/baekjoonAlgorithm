import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {

    public String[] solution(String[] strings, int n) {

        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<strings.length; i++) {
            String temp = strings[i].charAt(n) + strings[i];
            arr.add(temp);
        }

        Collections.sort(arr);

        String[] answer = new String[strings.length];

        for(int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i).substring(1);
        }

        return answer;
    }
}