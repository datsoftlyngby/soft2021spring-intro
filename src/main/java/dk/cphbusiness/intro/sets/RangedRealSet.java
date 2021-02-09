package dk.cphbusiness.intro.sets;

public class RangedRealSet implements RealSet {
  private final boolean includeMin;
  private final double min;
  private final boolean includeMax;
  private final double max;

  public RangedRealSet(boolean includeMin, double min, boolean includeMax, double max) {
    this.includeMin = includeMin;
    this.min = min;
    this.includeMax = includeMax;
    this.max = max;
    }

  @Override
  public boolean contains(double real) {
    if (includeMin && includeMax) return min <= real && real <= max;
    if (includeMin) return min <= real && real < max;
    if (includeMax) return min < real && real <= max;
    return min < real && real < max;

    }

  }
