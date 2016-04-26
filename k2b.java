class k2b{
	public static void main (String[] args){
		if(args.length>0 && args[0].length()>0) System.out.println(k2b(args[0]));
	}

	public static String k2b(String str){
		char ch = str.charAt(0);
		switch(ch){
			case '1': ch = 'ㄅ'; break;
			case 'q': ch = 'ㄆ'; break;
			case 'a': ch = 'ㄇ'; break;
			case 'z': ch = 'ㄈ'; break;
			case '2': ch = 'ㄉ'; break;
			case 'w': ch = 'ㄊ'; break;
			case 's': ch = 'ㄋ'; break;
			case 'x': ch = 'ㄌ'; break;
			case 'e': ch = 'ㄍ'; break;
			case 'd': ch = 'ㄎ'; break;
			case 'c': ch = 'ㄏ'; break;
			case 'r': ch = 'ㄐ'; break;
			case 'f': ch = 'ㄑ'; break;
			case 'v': ch = 'ㄒ'; break;
			case '5': ch = 'ㄓ'; break;
			case 't': ch = 'ㄔ'; break;
			case 'g': ch = 'ㄕ'; break;
			case 'b': ch = 'ㄖ'; break;
			case 'y': ch = 'ㄗ'; break;
			case 'h': ch = 'ㄘ'; break;
			case 'n': ch = 'ㄙ'; break;
			case 'u': ch = 'ㄧ'; break;
			case 'j': ch = 'ㄨ'; break;
			case 'm': ch = 'ㄩ'; break;
			case '8': ch = 'ㄚ'; break;
			case 'i': ch = 'ㄛ'; break;
			case 'k': ch = 'ㄜ'; break;
			case ',': ch = 'ㄝ'; break;
			case '9': ch = 'ㄞ'; break;
			case 'o': ch = 'ㄟ'; break;
			case 'l': ch = 'ㄠ'; break;
			case '.': ch = 'ㄡ'; break;
			case '0': ch = 'ㄢ'; break;
			case 'p': ch = 'ㄣ'; break;
			case ';': ch = 'ㄤ'; break;
			case '/': ch = 'ㄥ'; break;
			case '-': ch = 'ㄦ'; break;
			case '6': ch = 'ˊ'; break;
			case '3': ch = 'ˇ'; break;
			case '4': ch = 'ˋ'; break;
			case '7': ch = '˙'; break;
			default : break;
		}
		return String.format("%c%s", ch, (str.length()>1) ? k2b(str.substring(1)) : "");
	}
}
