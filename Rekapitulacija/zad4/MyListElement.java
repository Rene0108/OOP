package zad4;

class MyListElement {
    
	private Object object;
	private MyListElement next;
	
	public MyListElement(Object object) {
		this.object = object;
	}
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}
	
	public void setNext(MyListElement next) {
		this.next = next;
	}
	
	public MyListElement getNext() {
		return next;
	}
}
