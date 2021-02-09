package dk.cphbusiness.intro.graphs;

public class ArrayStack<T> implements Stack<T> {
  private int next = 0;
  private T[] data;

  public ArrayStack(int max) {
    data = (T[])(new Object[max]);
    }

//  private int addOneToNextAfterUse() {
//    int value = next;
//    next = next + 1;
//    return value;
//    }
//
//  private int subtractOneFromNextBeforeUse() {
//    next = next - 1;
//    return next;
//    }

  @Override
  public void push(T item) {
    data[next++] = item;
    // data[addOneToNextAfterUse()] = item;
    }

  @Override
  public T pop() {
    return data[--next];
    // return data[subtractOneFromNextBeforeUse()];
    }

  @Override
  public T peek() {
    return data[next - 1];
    }

  @Override
  public boolean isEmpty() {
    return next == 0;
    }

  }
