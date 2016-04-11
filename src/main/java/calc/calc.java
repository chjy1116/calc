package calc;

public class calc {
	private int result;
	public void add(int x, int y) {
		result =x+y;
	}
	
	public int getResult() {
		return result;
	}
	
	public void sub(int x, int y) {
		result =x-y;
	}
	
	public void mul(int x, int y) {
		result =x*y;
	}
		
	public void div(int x, int y) {
		result =x/y;
	}
}
