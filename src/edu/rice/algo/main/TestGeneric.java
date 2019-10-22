package edu.rice.algo.main;

class Point<T> {
	private T x;
	private T y;
	/**
	 * @return the x
	 */
	public T getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(T x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public T getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(T y) {
		this.y = y;
	}
	
}

/**
 * 经纬度
 * 三种类型：int float String
 * @author jianchen
 *
 */
public class TestGeneric {

	public static void main(String[] args) {
		Point<String> p = new Point<String>();
		p.setX("经度是10");
		p.setY("纬度是30");
		System.out.println(p.getX() + "\t\t" + p.getY());
		
		Point<Integer> q = new Point<Integer>();
		q.setX(10);
		q.setY(30);
		System.out.println(q.getX() + "\t\t" + q.getY());

	}

}
