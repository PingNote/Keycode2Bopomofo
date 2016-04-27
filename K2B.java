package k2b;

import java.util.HashMap;
import java.util.Map;

public class K2B {

    private void initKBMap() {
        this.kbMap = new HashMap<>();
        kbMap.put('1', 'ㄅ');
        kbMap.put('q', 'ㄆ');
        kbMap.put('a', 'ㄇ');
        kbMap.put('z', 'ㄈ');
        kbMap.put('2', 'ㄉ');
        kbMap.put('w', 'ㄊ');
        kbMap.put('s', 'ㄋ');
        kbMap.put('x', 'ㄌ');
        kbMap.put('e', 'ㄍ');
        kbMap.put('d', 'ㄎ');
        kbMap.put('c', 'ㄏ');
        kbMap.put('r', 'ㄐ');
        kbMap.put('f', 'ㄑ');
        kbMap.put('v', 'ㄒ');
        kbMap.put('5', 'ㄓ');
        kbMap.put('t', 'ㄔ');
        kbMap.put('g', 'ㄕ');
        kbMap.put('b', 'ㄖ');
        kbMap.put('y', 'ㄗ');
        kbMap.put('h', 'ㄘ');
        kbMap.put('n', 'ㄙ');
        kbMap.put('u', 'ㄧ');
        kbMap.put('j', 'ㄨ');
        kbMap.put('m', 'ㄩ');
        kbMap.put('8', 'ㄚ');
        kbMap.put('i', 'ㄛ');
        kbMap.put('k', 'ㄜ');
        kbMap.put(',', 'ㄝ');
        kbMap.put('9', 'ㄞ');
        kbMap.put('o', 'ㄟ');
        kbMap.put('l', 'ㄠ');
        kbMap.put('.', 'ㄡ');
        kbMap.put('0', 'ㄢ');
        kbMap.put('p', 'ㄣ');
        kbMap.put(';', 'ㄤ');
        kbMap.put('/', 'ㄥ');
        kbMap.put('-', 'ㄦ');
        kbMap.put('6', 'ˊ');
        kbMap.put('3', 'ˇ');
        kbMap.put('4', 'ˋ');
        kbMap.put('7', '˙');
        kbMap.put(' ', ' ');
    }

    public String generateK2b(String kbChars) {
        StringBuilder sb = new StringBuilder();

        kbChars.chars().forEachOrdered((val) -> {
            char c = (char) val;
            char bpmf = kbMap.get(c);
            sb.append(bpmf);
        });

        return sb.toString();
    }
    public static void main(String[] args) {
        K2B k2bGenerator = new K2B();
        if (args.length == 0) {
            usage();
        } else {
            String result = k2bGenerator.generateK2b(args[0]);
            System.out.println(result);
        }

    }
}
