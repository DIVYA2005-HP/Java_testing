package java.testing2;

public class Calci {
	Calculator cal;
	
	Calci(Calculator cal1){
		cal=cal1;
	}
	public int sum(int x,int y) {
		return cal.add(x,y);
	}
	

}
