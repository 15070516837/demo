package jieko;

public abstract class donwu {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void su();
	public donwu(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
}
class qingwa extends donwu implements t,z{
	public qingwa(String name,int age){
		super(name,age);
	}
	public void su() {
		System.out.println(this.getName()+"������"+"������"+this.getAge());
	}
	public void tiao() {
		System.out.println("������");
	}
	public void zo() {
		System.out.println("������");
	}
}
class niu extends donwu implements z,p{
	public niu(String name,int age){
		super(name,age);
	}
	public void su() {
		System.out.println(this.getName()+"�Բ�"+"������"+this.getAge());
	}
	public void zo() {
		System.out.println("ţ��");
	}
	public void qiao() {
		System.out.println("ţ��");
	}
}
class renlei extends donwu implements t,z,p{
	public renlei(String name,int age){
		super(name,age);
	}
	public void su() {
		System.out.println(this.getName()+"ʲô����"+"������"+this.getAge());
	}
	public void tiao() {
		System.out.println("����");
	}
	public void zo() {
		System.out.println("����");
	}
	public void qiao() {
		System.out.println("����");
	}
}
