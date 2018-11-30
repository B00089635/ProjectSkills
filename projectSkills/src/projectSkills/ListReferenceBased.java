package projectSkills;
// ****************************************************
// Reference-based implementation of ADT list.
// ****************************************************
public class ListReferenceBased implements ListInterface {
	// reference to linked list of items
	private Node head = new Node();
	private int numItems; // number of items in list

	public ListReferenceBased() {
	} // end default constructor

	public boolean isEmpty() {
		if (numItems == 0) {
			return true;
		}
		return false;
	} // end isEmpty

	public int size() {
		return numItems;
	} // end size

	public String get(int index) throws ListIndexOutOfBoundsException {
		int counter = 0;
		Node curr = head.getNext();
		while (counter != index) {
			curr = curr.getNext();
			counter++;
		}
		return curr.display();
	} // end get

	public void add(int index, Object item) throws ListIndexOutOfBoundsException {
		if (index > numItems) {
			throw new ListIndexOutOfBoundsException(null);
		} else if (index < numItems) {
			insert(index, item);
			return;
		}
		Node newNode = new Node(item);
		Node currNode = head;
		boolean breakLoop = false;
		while (currNode != null) {
			if (currNode.getNext() == null && breakLoop == false) {
				currNode.setNext(newNode);
				breakLoop = true;
			}
			currNode = currNode.getNext();
		}
		numItems++;
	} // end add
	
	private void insert(int index, Object item) {
		Node curr = head.getNext();
		Node newNode = new Node(item);
		Node preNode = head;
		int counter = 0;
		while (counter != index) {
			curr = curr.getNext();
			preNode = preNode.getNext();
			counter++;
		}
		newNode.setNext(curr);
	}

	public void display() {
		Node curr = head.getNext();
		while (curr != null) {
			System.out.println(curr.display());
			curr = curr.getNext();
		}
	}

	public void remove(int index) throws ListIndexOutOfBoundsException {
		if (index > numItems) {
			throw new ListIndexOutOfBoundsException(null);
		}
		int counter = 0;
		Node preNode = head;
		Node curr = head.getNext();
		while (counter != index) {
			curr = curr.getNext();
			preNode = preNode.getNext();
			counter++;
		}
		preNode.setNext(curr.getNext());
		numItems--;
	} // end remove

	public void removeAll() {
		head = null;
		numItems = 0;
	} // end removeAll
} // end ListReferenceBased