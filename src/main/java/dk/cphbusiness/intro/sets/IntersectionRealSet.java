package dk.cphbusiness.intro.sets;

public class IntersectionRealSet implements RealSet {
  private final RealSet first;
  private final RealSet second;

  public IntersectionRealSet(RealSet first, RealSet second) {
    this.first = first;
    this.second = second;
     }

  @Override
  public boolean contains(double real) {
    return first.contains(real) && second.contains(real);
    }

  }
