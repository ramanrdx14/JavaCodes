package Lec31;
public class BinaryTree_Client {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.display();
		//System.out.println(bt.getSize());
		System.out.println(bt.findDiameter2());
		System.out.println(bt.diameter1());
	}
}
