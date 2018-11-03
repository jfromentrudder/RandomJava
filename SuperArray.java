public class SuperArray {
	Object[] data;
	int numElements;
	
	public SuperArray() {
	numElements = 0;
	data = new Object[5];
	}
	
	public SuperArray(int size) {
	numElements = 0;
	data = new Object[size];
	}
	
	public String toString() {
	String s = "";
	 for (int i = 0; i < data.length; i ++) {
		if (i == data.length - 1) {
			s += data[i];
			}
		
		else {
			s += data[i] + ", ";
			}
		}
	return s + "\n";
	}
	
	private void resize() {
	Object[] data2 = new Object[numElements + 2];
	
	for (int i = 0; i < data.length; i ++) {
		data2[i] = data[i];
		}
	data = data2;
	}
	
	public void add(Object o) {
	data[numElements] = o;
	numElements ++;
	if (numElements == data.length)
		resize();
	}
	
	public int size() {
	return numElements;
	}
	
	public Object get(int n) {
	if (n > numElements) {
		return null;
	}
	else {
		return data[n];
	}
	}
	
	public void add(Object o, int n) {
	if (n > numElements) {
		add(o);
	}
	else if (n >= 0){
		for (int i = numElements + 1; i > n; i --) {
			data[i] = data[i - 1];
		}
		data[n] = o;
	}
	}
	
	public Object remove(int n) {
	Object temp = data[n];
	
	if (n > numElements || n < 0) {
		temp = null;
	}
	else {
		for (int i = n; i < numElements + 1; i ++){
			data[i] = data[i + 1];
		}
	}
	return temp;
	}
	
	public Object set(Object o, int n) {
	Object temp = data[n];
	if(n >= 0) {
		data[n] = o;
	}
	else if (n < 0 || n > numElements){
		temp = null;
	}
	return temp;
	}
	
	public static void main(String args[]) {
	SuperArray s = new SuperArray();
	s.add(3);
	s.add('J');
	s.add("something");
	System.out.println(s);
	System.out.println(s.size());
	
	SuperArray s2 = new SuperArray(3);
	s2.add(1);
	s2.add(2);
	s2.add(3);
	s2.add(4);
	s2.add(5);
	System.out.println(s2);
	System.out.println(s2.get(4));
	s2.add("Lol", 2);
	System.out.println(s2);
	s2.remove(3);
	System.out.println(s2);
	s2.set("Thingy", 1);
	System.out.println(s2);
	}
}