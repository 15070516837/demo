package jieko;
class vip{
	public static void su1(donwu e) {
		if(e instanceof qingwa) {
			e.su();
			((qingwa) e).tiao();
			((qingwa) e).zo();
		}else if(e instanceof niu){
			e.su();
			((niu) e).qiao();
			((niu) e).zo();
		}else if(e instanceof renlei) {
			e.su();
			((renlei) e).qiao();
			((renlei) e).zo();
			((renlei) e).tiao();
		}
	}
}
public class donwutese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vip.su1(new renlei("ะกร๗",50));
		
	}

}
