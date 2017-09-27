package mpp.tinkering.inheritance.lecture3.inheritance1;

import java.util.AbstractList;
import java.util.List;
import java.util.logging.Logger;


public class MyStringList extends AbstractList<String>{
	private static final Logger LOG = Logger.getLogger(MyStringList.class.getName());
	private String[] arr = new String[2];
	private int size = 0;
	
	@Override
	public String get(int index) {
		if(index < 0 || index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return arr[index];
	}
	@Override
	 public void add(int index, String element) {
		if(index < 0 || index > size() + 1) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		arr[index] = element;
		++size;
    }

	@Override
	public int size() {
		if(isFull()) {
			resize();
		}
		return size;
	}
	
	private boolean isFull() {
		return arr[arr.length - 1] != null;
	}
	private void resize() {
		LOG.info("Resizing background array");
		String[] temp = new String[2 * arr.length];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}
	
	public static void main(String[] args) {
		List<String> list = new MyStringList();
		list.add("Bob");
		list.add("Steve");
		list.add("Thomas");
		System.out.println(list);
		//Can use for each construct
		for(String s : list) {
			System.out.println(s.toUpperCase());
		}
	}

}
