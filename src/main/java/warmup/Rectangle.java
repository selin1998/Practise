package warmup;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class Rectangle {
  private final Point p1;
  private final Point p2;

  static Rectangle random() {
    return new Rectangle(Point.random(), Point.random());
  }

  Rectangle(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }
  public int area() {
    return Math.abs(p1.x() - p2.x()) * Math.abs(p1.y() - p2.y());
  }

  @Override
  public String toString() {
    return "Rectangle{" +
            "p1=" + p1 +
            ", p2=" + p2 +
            '}';
  }
}
