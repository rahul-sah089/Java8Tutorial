package basics;

import java.util.ArrayList;
import java.util.List;

public class IQ1 {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("");
        for(String s: sList){
            System.out.println(s.length());
        }
        sList.add(null);
        for(String s: sList){
            System.out.println(s.length());
        }
    }
}
