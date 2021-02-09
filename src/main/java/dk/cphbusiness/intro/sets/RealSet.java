package dk.cphbusiness.intro.sets;

public interface RealSet {
  boolean contains(double real);
  default RealSet union(RealSet other) { return new UnionRealSet(this, other); }
  }
