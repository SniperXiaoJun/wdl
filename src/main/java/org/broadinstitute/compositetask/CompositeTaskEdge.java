package org.broadinstitute.compositetask;

public class CompositeTaskEdge implements Comparable<CompositeTaskEdge> {
  private CompositeTaskVertex start;
  private CompositeTaskVertex end;

  CompositeTaskEdge(CompositeTaskVertex start, CompositeTaskVertex end) {
    this.start = start;
    this.end = end;
  }

  public CompositeTaskVertex getStart() {
    return this.start;
  }

  public CompositeTaskVertex getEnd() {
    return this.end;
  }

  public void setStart(CompositeTaskVertex start) {
    this.start = start;
  }

  public void setEnd(CompositeTaskVertex end) {
    this.end = end;
  }

  public int compareTo(CompositeTaskEdge other) {
    return this.toString().compareTo(other.toString());
  }

  public String toString() {
    return "[Edge\n  from: "+this.start+"\n  to: "+this.end+"\n]";
  }
}