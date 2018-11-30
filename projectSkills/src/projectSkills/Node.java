package projectSkills;
public class Node {
  private Object item;
  private Object data;
  private Node next;
  Node(){data = null;next = null;}
  
  public Node(Object newItem) {
    item = newItem;
    next = null;
  } // end constructor

  public Node(Object newItem, Node nextNode) {
    item = newItem;
    next = nextNode;
  } // end constructor

  public void setItem(Object newItem) {
    item = newItem;
  } // end setItem
  
  public String display() {
	return item.toString();
  }

  public Object getItem() {
    return item;
  } // end getItem

  public void setNext(Node nextNode) {
    next = nextNode;
  } // end setNext

  public Node getNext() {
    return next;
  } // end getNext

} // end class Node
