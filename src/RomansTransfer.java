import java.util.HashMap;
import java.util.Map;

public class RomansTransfer implements ITest {

    private static Map<Character, Integer> sRomansTable = new HashMap<>();

    static {
        sRomansTable.put('I', 1);
        sRomansTable.put('V', 5);
        sRomansTable.put('X', 10);
        sRomansTable.put('L', 50);
        sRomansTable.put('C', 100);
        sRomansTable.put('D', 500);
        sRomansTable.put('M', 1000);
    }

    @Override
    public void test() {
        String romans = "MCMXCIV";
        int sum = 0;
        int preValue = 0;
        for (char c : romans.toCharArray()
        ) {
            int value = sRomansTable.get(c);
            if (preValue < value) {
                value *= -1;
            }
            sum += value;
            preValue = sRomansTable.get(c);
        }

        System.out.println("RomansTransfer=" + sum*(-1));
    }
}
