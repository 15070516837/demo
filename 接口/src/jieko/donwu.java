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
		System.out.println(this.getName()+"吃昆虫"+"年龄是"+this.getAge());
	}
	public void tiao() {
		System.out.println("青蛙跳");
	}
	public void zo() {
		System.out.println("青蛙走");
	}
}
class niu extends donwu implements z,p{
	public niu(String name,int age){
		super(name,age);
	}
	public void su() {
		System.out.println(this.getName()+"吃草"+"年龄是"+this.getAge());
	}
	public void zo() {
		System.out.println("牛走");
	}
	public void qiao() {
		System.out.println("牛跑");
	}
}
class renlei extends donwu implements t,z,p{
	public renlei(String name,int age){
		super(name,age);
	}
	public void su() {
		System.out.println(this.getName()+"什么都吃"+"年龄是"+this.getAge());
	}
	public void tiao() {
		System.out.println("人跳");
	}
	public void zo() {
		System.out.println("人走");
	}
	public void qiao() {
		System.out.println("人跑");
	}
}
