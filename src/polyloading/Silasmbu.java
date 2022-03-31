package polyloading;

public class Silasmbu extends Loading{
	
	@Override
	public void ril() {
		System.out.println("12");
	
	}
	@Override
	public void sil() {
		System.out.println("arun");
		super.sil();
	}
	public static void main(String[] args) {
		Silasmbu s = new Silasmbu();
		s.ril();
		s.sil();
	}
}



