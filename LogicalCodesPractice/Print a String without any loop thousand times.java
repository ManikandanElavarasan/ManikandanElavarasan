package first;

public class Printsomethingwithoutanyloopthousandtimes {

	public static void main(String[] args) {
		String str="code";
		String s="s";
		s=s.replaceAll("s", "ssssssssss");
		s=s.replaceAll("s", "ssssssssss");
		s=s.replaceAll("s", "ssssssssss");
		s=s.replaceAll("s", str+"\n");
		System.out.println(s);

	}

}
