package k2b;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class K2B {

    private Map<Character, Character> kbMap;
    private Map<Character, Integer> kbVkMap;

    public K2B() {
        this.initKBMap();
        this.initkbVkMap();
    }

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

    private void initkbVkMap() {
        this.kbVkMap = new HashMap<>();
        kbVkMap.put('1', KeyEvent.VK_1);
        kbVkMap.put('q', KeyEvent.VK_Q);
        kbVkMap.put('a', KeyEvent.VK_A);
        kbVkMap.put('z', KeyEvent.VK_Z);
        kbVkMap.put('2', KeyEvent.VK_2);
        kbVkMap.put('w', KeyEvent.VK_W);
        kbVkMap.put('s', KeyEvent.VK_S);
        kbVkMap.put('x', KeyEvent.VK_X);
        kbVkMap.put('e', KeyEvent.VK_E);
        kbVkMap.put('d', KeyEvent.VK_D);
        kbVkMap.put('c', KeyEvent.VK_C);
        kbVkMap.put('r', KeyEvent.VK_R);
        kbVkMap.put('f', KeyEvent.VK_F);
        kbVkMap.put('v', KeyEvent.VK_V);
        kbVkMap.put('5', KeyEvent.VK_5);
        kbVkMap.put('t', KeyEvent.VK_T);
        kbVkMap.put('g', KeyEvent.VK_G);
        kbVkMap.put('b', KeyEvent.VK_B);
        kbVkMap.put('y', KeyEvent.VK_Y);
        kbVkMap.put('h', KeyEvent.VK_H);
        kbVkMap.put('n', KeyEvent.VK_N);
        kbVkMap.put('u', KeyEvent.VK_U);
        kbVkMap.put('j', KeyEvent.VK_J);
        kbVkMap.put('m', KeyEvent.VK_M);
        kbVkMap.put('8', KeyEvent.VK_8);
        kbVkMap.put('i', KeyEvent.VK_I);
        kbVkMap.put('k', KeyEvent.VK_K);
        kbVkMap.put(',', KeyEvent.VK_COMMA);
        kbVkMap.put('9', KeyEvent.VK_9);
        kbVkMap.put('o', KeyEvent.VK_O);
        kbVkMap.put('l', KeyEvent.VK_L);
        kbVkMap.put('.', KeyEvent.VK_PERIOD);
        kbVkMap.put('0', KeyEvent.VK_0);
        kbVkMap.put('p', KeyEvent.VK_P);
        kbVkMap.put(';', KeyEvent.VK_SEMICOLON);
        kbVkMap.put('/', KeyEvent.VK_SLASH);
        kbVkMap.put('-', KeyEvent.VK_MINUS);
        kbVkMap.put('6', KeyEvent.VK_6);
        kbVkMap.put('3', KeyEvent.VK_3);
        kbVkMap.put('4', KeyEvent.VK_4);
        kbVkMap.put('7', KeyEvent.VK_7);
        kbVkMap.put(' ', KeyEvent.VK_SPACE);

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

    public void autoInput(String kbChars) {

        try {
            Robot robot = new Robot();
            robot.delay(1000);
            kbChars.chars().forEachOrdered((val) -> {
                char c = (char) val;
                int key = kbVkMap.get(c);
                robot.keyPress(key);
                robot.keyRelease(key);
            });
        } catch (AWTException ex) {
            Logger.getLogger(K2B.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void usage() {
        System.out.println("Usage: ");
        System.out.println("\tK2B [--auto-input] [your keyboard string]");
    }

    public static void main(String[] args) {
        K2B k2bGenerator = new K2B();

        if (args.length == 0) {
            usage();
        } else if(args.length == 1){
            String result = k2bGenerator.generateK2b(args[0]);
            System.out.println(result);
        } else {
            String kbString = "";
            if(args[0].equals("--auto-input")) {
                String[] tmpStrings = new String[args.length-1];
                System.arraycopy(args, 1, tmpStrings, 0, args.length-1);
                kbString = String.join(" ", tmpStrings);
                k2bGenerator.autoInput(kbString);
            } else {
                kbString = String.join(" ", args);
            }
            String result = k2bGenerator.generateK2b(kbString);
            System.out.println(result);
        }

    }
}
