package dk.cphbusiness.intro.graphs;

public class LinkedStack<T> implements Stack<T> {
  private Node<T> top = null;

  private static class Node<T> {
    final Node next;
    final T value;

    Node(Node next, T value) {
      this.next = next;
      this.value = value;
      }
    }

  @Override
  public void push(T item) {
    top = new Node(top, item);

    // top --> null
    // top --> Node(null, 7) --> null
    // top --> Node(node7, 9) --> Node(null, 7) --> null
    // top --> Node(node9, 13) --> Node(node7, 9) --> Node(null, 7) --> null
    }

  @Override
  public T pop() {
    T value = top.value;
    top = top.next;
    return value;
    }

  @Override
  public T peek() {
    return top.value;
    }

  @Override
  public boolean isEmpty() {
    return top == null;
    }

  }
