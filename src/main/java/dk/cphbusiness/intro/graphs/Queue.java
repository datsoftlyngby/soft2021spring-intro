package dk.cphbusiness.intro.graphs;

public interface Queue<T> {
  void enqueue(T item);
  T dequeue();
  T peek();
  boolean isEmpty();
  }
