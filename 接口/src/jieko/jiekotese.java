package jieko;

public class jiekotese {
	public static void main(String[] args) {
		tess s1=new tess();
		s1.su();
		s1.su1();
	}
}
interface qwutiao{
	void su();
}
interface qwupao{
	void su1();
}
class tess implements qwutiao,qwupao{
	public void su() {
		System.out.println("Ìø");
	}
	public void su1() {
		System.out.println("ÅÜ");
	}
}