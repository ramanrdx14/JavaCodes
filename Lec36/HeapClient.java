package Lec36;

public class HeapClient {

	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.add(10);
		heap.display();
		heap.add(20);
		heap.display();
		heap.add(30);
		heap.display();
		heap.add(40);
		heap.display();
		heap.add(5);
		heap.display();
		heap.add(3);
		heap.display();
		while(!heap.isEmpty()) {
			System.out.println(heap.remove());
		}
	}

}