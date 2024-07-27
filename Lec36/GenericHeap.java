package Lec36;
import java.util.*;
public class GenericHeap<T extends Comparable<T>> {
	ArrayList<T> data = new ArrayList<>();
	public void add(T item) {
		data.add(item);
		upheapify(data.size()-1);
	}
	private void upheapify(int ci) {
		if(ci == 0)return;
		int pi = (ci-1)/2;
		if(isLarger(data.get(ci), data.get(pi)) > 0) {
			swap(ci,pi);
		}
		upheapify(pi);
	}
	private void swap(int i,int j) {
		T temp = data.get(i);
		data.set(i, data.get(j));
		data.set(j, temp);
	}
	public int size()
	{
		return data.size();
	}
	public void display() {
		System.out.println(data);
	}
	public boolean isEmpty() {
		return size()==0?true:false;
	}
	public T remove() {
		//swap kro parent aur array ka last index se :
		swap(0,data.size()-1);
		T temp = data.remove(data.size()-1);
		downheapify(0);
		return temp;
	}
	public void downheapify(int parent) {
		int leftchildindex =  2*parent+1;
		int rightchildindex=  2*parent+2;
		
		int mini           = parent;
		if(leftchildindex < this.data.size() && isLarger(data.get(leftchildindex), data.get(mini)) > 0) {
			mini = leftchildindex;
		}
		
		if(rightchildindex < this.data.size() && isLarger(data.get(rightchildindex), data.get(mini)) > 0) {
			mini = rightchildindex;
		}
		if(mini != parent) {
		swap(mini, parent);
		downheapify(mini);
		}
	}
	public T get() {
		return data.get(0);
	}
	public int isLarger(T o1,T  o2) {
		return o1.compareTo(o2);
	}
}
