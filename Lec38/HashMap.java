package Lec38;

public class HashMap {

	class Node{
		String key;
		Integer value;
		Node next;
	}
	private int size;
	private Node[] buk;
	public HashMap(int size) {
		buk = new Node[size];
	}
	
	public HashMap() {
		this(4);
	}
	
	public void put(String key,Integer val) {
		//linked list ka address nikalna 1st 
		int idx = hashFunction(key);
		Node temp = buk[idx];
		while(temp != null) {
			if(temp.key == key) {
				temp.value = val;
				return;
			}
			temp = temp.next;
		}
		
		Node node = new Node();
		node.value = val;
		node.key   = key;
		node.next  = buk[idx];
		buk[idx]   = node;
		size++;
		double tf = 2.0;
		double lf = (1.0 * size)/buk.length;
		if(lf > tf) {
			rehashing();
		}
	}
	private void rehashing() {
		Node[] bukarray = new Node[size * 2];
		Node[] a   = buk;
		buk        = bukarray;
		size       = 0;
		for(Node temp:a) {
			while(temp != null) {
				put(temp.key,temp.value);
				temp = temp.next;
			}
		}
		
	}
	public Integer get(String key) {
		int idx = hashFunction(key);
		Node temp = buk[idx];
		while(temp != null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}
	public boolean containsKey(String key) {
		int idx = hashFunction(key);
		Node temp = buk[idx];
		while(temp != null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public Integer remove(String key) {
		int idx = hashFunction(key);
		Node temp = buk[idx];
		Node prev = null;
		while(temp != null) {
			if(temp.key.equals(key)) {
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		if(temp == null)return null;
		
		if(prev == null) {//First element ho to 
			buk[idx] = temp.next;
			temp.next = null;
		}else {
			prev.next = temp.next;
			temp.next = null;
		}
		size--;
		return temp.value;
	}
	public int hashFunction(String key) {
		int idx = key.hashCode() % buk.length;
		if(idx < 0) {  // to get the +ve remainder
			idx+=buk.length;
		}
		return idx;
	}
	@Override
	public String toString() {
		String s ="{";
		Node[] a = buk;
		for(Node temp:a) {
			while(temp != null) {
				s+=temp.key+" = "+temp.value+",";
				temp = temp.next;
			}
		}
		s=s.substring(0,s.length()-1);
		return s+"}";
	}
}
