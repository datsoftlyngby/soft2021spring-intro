package dk.cphbusiness.intro.graphs;

public interface Stack<T> {
  void push(T item);
  T pop();
  T peek();
  boolean isEmpty();
  }
