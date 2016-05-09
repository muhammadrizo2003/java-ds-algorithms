package anthonynsimon.datastructures;

import java.util.EmptyStackException;

public class Stack<E> {
  
  protected int size;
  protected SinglyNode<E> top;
  
  public Stack() {
    this.size = 0;
    this.top = null;
  }
  
  public int size() {
    return this.size;
  }
  
  public E peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return this.top.getData();
  }
  
  public void push(E data) {
    SinglyNode<E> newNode = new SinglyNode<E>(data);
    
    if (isEmpty()) {
      this.top = newNode;
    }
    else {
      newNode.setNext(this.top);
      this.top = newNode;
    }
    
    this.size++;
  }
  
  public E pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    
    E data = this.top.getData();
    this.top = this.top.getNext();
    this.size--;
    
    return data;
  }
  
  public void clear() {
    this.top = null;
    this.size = 0;
  }
  
  public boolean isEmpty() {
    return size() == 0;
  }
}