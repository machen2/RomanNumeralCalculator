import java.util.HashMap;
import java.util.Map;

public class NumeralConverter {

    Map<Character, Integer> numeralMap;

    public NumeralConverter() {
        numeralMap = new HashMap<>();
        numeralMap.put('I', 1);
        numeralMap.put('V', 5);
        numeralMap.put('X', 10);
        numeralMap.put('L', 50);
        numeralMap.put('C', 100);
        numeralMap.put('D', 500);
        numeralMap.put('M', 1000);
    }

    public int convertToInteger(String numeral) {
        int total = 0;
        for (int i=0; i < numeral.length(); i++) {
            if (shouldSubtract(numeral, i)) {
                total -= numeralMap.get(numeral.charAt(i));
            } else {
                total += numeralMap.get(numeral.charAt(i));
            }
        }

        return total;
    }

    private boolean shouldSubtract(String numeral, int index) {
        return numeral.length()-1 > index &&
                numeralMap.get(numeral.charAt(index)) < numeralMap.get(numeral.charAt(index+1));
    }
}
