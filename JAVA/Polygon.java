package abstractclass;

interface Polygon {
	void getArea(int length,int breadth);

}
class Rectangle implements Polygon{
	public void getArea(int length,int breadth) {
		System.out.println("The area of rectangle is "+(length+breadth));
	}
}
class main11{
	public static void main(String args[]) {
		Rectangle r1=new Rectangle();
		r1.getArea(5, 6);
	}
}
