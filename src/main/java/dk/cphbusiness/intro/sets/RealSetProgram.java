package dk.cphbusiness.intro.sets;

public class RealSetProgram {
  public static void main(String[] args) {
    RealSet m1 = new RangedRealSet(false, 0.0, true, 10.0);
    boolean a1 = m1.contains(5.0);
    boolean a2 = m1.contains(0.0);

    }
  }
