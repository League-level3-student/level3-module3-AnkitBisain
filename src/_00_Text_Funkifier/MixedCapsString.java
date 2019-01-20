package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String t = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(i % 2 == 1) {
			if(c == ' ') {
				t+=" ";
			}else {	
			if(Character.isUpperCase(c)==true) {
				t+= Character.toString(Character.toLowerCase(c));
			}else {
			if(Character.isLowerCase(c)==true) {
				t+= Character.toString(Character.toUpperCase(c));
			}}}}
			if(i % 2 ==0) {
				t+=Character.toString(s.charAt(i));
			}
		}
		return t;
	}

}
