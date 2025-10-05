import java.util.HashSet;

public class CustomString {
	
	private String text;
	
	public CustomString(String text) {
		// TODO Auto-generated constructor stub
		this.text = text;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode appelée");
		return text.length();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals appelée, comparing " + obj + " to " + this);

		if(this == obj) return true;
		
		if ( obj == null ) return false;
		
		if ( this.getClass() != obj.getClass() ) return false;
		
		//if ( !(obj instanceof CustomString )) return false;
		
		CustomString s = (CustomString) obj;
		
		return s.text.equals(this.text);
	}
	
	@Override
	public String toString() {
		return text;
	}
	
	public static void main(String[] args) {

		CustomString s1 = new CustomString("test");
		CustomString s2 = new CustomString("tessqsgsfdqst");
	
		HashSet<CustomString> set = new HashSet<>();

		set.add(s1);
		set.add(s2);
		set.add(new CustomString("salu"));
		set.add(new CustomString("lasu"));
		set.add(new CustomString("saai"));
		set.add(new CustomString("salu"));
		
		
		// hashSet :
		// list de hashshode()
		// 4 -> {s1, s3, s4, s5}
		// 13 -> {s8}
		// 2 -> {s12}
		// 1 -> {s9}
		
		
		
		
	}
}

