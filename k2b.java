class k2b{
	public static void main (String[] args){
		if(args.length>0) System.out.println(k2b(args[0]));
	}

	public static String k2b(String str){
		char ch = str.charAt(0);
		switch(ch){
			case '1': case '!': ch = 'ㄅ'; break;
			case 'q': case 'Q': ch = 'ㄆ'; break;
			case 'a': case 'A': ch = 'ㄇ'; break;
			case 'z': case 'Z': ch = 'ㄈ'; break;
			case '2': case '@': ch = 'ㄉ'; break;
			case 'w': case 'W': ch = 'ㄊ'; break;
			case 's': case 'S': ch = 'ㄋ'; break;
			case 'x': case 'X': ch = 'ㄌ'; break;
			case 'e': case 'E': ch = 'ㄍ'; break;
			case 'd': case 'D': ch = 'ㄎ'; break;
			case 'c': case 'C': ch = 'ㄏ'; break;
			case 'r': case 'R': ch = 'ㄐ'; break;
			case 'f': case 'F': ch = 'ㄑ'; break;
			case 'v': case 'V': ch = 'ㄒ'; break;
			case '5': case '%': ch = 'ㄓ'; break;
			case 't': case 'T': ch = 'ㄔ'; break;
			case 'g': case 'G': ch = 'ㄕ'; break;
			case 'b': case 'B': ch = 'ㄖ'; break;
			case 'y': case 'Y': ch = 'ㄗ'; break;
			case 'h': case 'H': ch = 'ㄘ'; break;
			case 'n': case 'N': ch = 'ㄙ'; break;
			case 'u': case 'U': ch = 'ㄧ'; break;
			case 'j': case 'J': ch = 'ㄨ'; break;
			case 'm': case 'M': ch = 'ㄩ'; break;
			case '8': case '*': ch = 'ㄚ'; break;
			case 'i': case 'I': ch = 'ㄛ'; break;
			case 'k': case 'K': ch = 'ㄜ'; break;
			case ',': case '<': ch = 'ㄝ'; break;
			case '9': case '(': ch = 'ㄞ'; break;
			case 'o': case 'O': ch = 'ㄟ'; break;
			case 'l': case 'L': ch = 'ㄠ'; break;
			case '.': case '>': ch = 'ㄡ'; break;
			case '0': case ')': ch = 'ㄢ'; break;
			case 'p': case 'P': ch = 'ㄣ'; break;
			case ';': case ':': ch = 'ㄤ'; break;
			case '/': case '?': ch = 'ㄥ'; break;
			case '-': case '_': ch = 'ㄦ'; break;
			case '6': case '^': ch = 'ˊ'; break;
			case '3': case '$': ch = 'ˇ'; break;
			case '4': case '#': ch = 'ˋ'; break;
			case '7': case '&': ch = '˙'; break;
			default : break;
		}
		return String.format("%c%s", ch, (str.length()>1) ? k2b(str.substring(1)) : "");
	}
}
