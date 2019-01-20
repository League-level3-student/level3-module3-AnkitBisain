package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String t = "";
		for(int i = 0; i < s.length(); i++) {
			t = t + s.substring(s.length()-i-1,s.length()-i);
		}
		return t;
	}

}
