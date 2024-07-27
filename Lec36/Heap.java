package Lec36;
import java.util.*;
public class Heap {
	ArrayList<Integer> data = new ArrayList<>();
	public void add(int item) {
		data.add(item);
		upheapify(data.size()-1);
	}
	private void upheapify(int ci) {
		if(ci == 0)return;
		int pi = (ci-1)/2;
		if(data.get(ci) < data.get(pi)) {
			swap(ci,pi);
		}
		upheapify(pi);
	}
	private void swap(int i,int j) {
		int temp = data.get(i);
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
	public int remove() {
		//swap kro parent aur array ka last index se :
		swap(0,data.size()-1);
		int temp = data.remove(data.size()-1);
		downheapify(0);
		return temp;
	}
	public void downheapify(int parent) {
		int leftchildindex =  2*parent+1;
		int rightchildindex=  2*parent+2;
		
		int mini           = parent;
		if(leftchildindex < this.data.size() && data.get(leftchildindex) < data.get(mini)) {
			mini = leftchildindex;
		}
		
		if(rightchildindex < this.data.size() &&data.get(rightchildindex) < data.get(mini)) {
			mini = rightchildindex;
		}
		if(mini != parent) {
		swap(mini, parent);
		downheapify(mini);
		}
	}
	public int get() {
		return data.get(0);
	}
}
