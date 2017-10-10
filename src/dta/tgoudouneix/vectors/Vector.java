package dta.tgoudouneix.vectors;

public class Vector {
	private int[] values;
	private int size;
	
	public Vector(int size, int[] array) {
		this.size = size;
		this.values = array;
	}
	
	public Vector(int size) {
		this(size, new int[size]);
	}
	
	public void ensureCapacity(int capacity) {
		if(this.values.length < capacity) {
			int newCapacity = Math.max(capacity, 2 * this.values.length);
			int[] array = new int[newCapacity];
			
			for(int i = 0; i < newCapacity; i++) {
				if(i < this.size) {
					array[i] = this.values[i];
				}
				else {
					array[i] = 0;
				}
			}
			
			this.values = array;
		}
	}
	
	public void resize(int size) {
		ensureCapacity(size);
		this.size = size;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void add(int element) {
		resize(size() + 1);
		set(size() - 1, element);
	}
	
	public void set(int index, int element) {
		if(index < this.size) 
			this.values[index] = element;
	}
	
	public int get(int index) {
		return (index < size ? this.values[index] : 0);
	}
}
