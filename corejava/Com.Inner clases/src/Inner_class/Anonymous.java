package Inner_class;

public class Anonymous {
public void data() {
	//1System.out.println("call");
}
	public void show() {
		
	}

public static void main(String[] args) {
	Anonymous a=new Anonymous() {
		public void show() {
		System.out.println("call,sms,video");
		
		}
		public void data() {
			System.out.println("call,chat,game,news");
		}
		
	};
	a.data();
	a.show();
}

}