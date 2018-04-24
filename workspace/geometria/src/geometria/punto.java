 package geometria;

public class punto {
	private int x;
	private int y;
	private char letra;
	public punto(int x, int y, char letra) {
		super();
		this.x = x;
		this.y = y;
		this.letra = letra;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
public getDistance(){
	double distance;   
	double c1,c2;
	c1=p2.getx()-p1.getx();
	c2=p1.gety()-p2.gety();
	distance=Math.sqrt()(Math.pow(c1, 2)+Math.pow(c1, 2))
	return distance;
}
}
