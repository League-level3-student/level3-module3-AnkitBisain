package _00_Text_Funkifier;

public class CoolerText extends SpecialString{

	public CoolerText(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String t = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == ' ') {
				t+=" ! ";
			}else {	
			t+= c;
			}
		}
		return t;
	}
	}
