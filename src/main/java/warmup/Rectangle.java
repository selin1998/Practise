package warmup;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

//  public int area() {
//    return Math.abs(p1.x() - p2.x()) * Math.abs(p1.y() - p2.y());
//  }


  private List<Integer> horizontal() {
    return IntStream.rangeClosed(Math.min(p1.x(), p2.x()), Math.max(p1.x(), p2.x())).boxed().collect(Collectors.toList());
  }

  private List<Integer> vertical() {
    return IntStream.rangeClosed(Math.min(p1.y(), p2.y()), Math.max(p1.y(), p2.y())).boxed().collect(Collectors.toList());
  }

  List<Point> points() {
    // collects all points on the rectangle area created by two lines defined above
    /*

        * -> p1 and p2   # -> horizontal and vertical lines  _ -> area not including lines,p1 and p2

        #_______*
        #________
        #________
        #________
        *########

     */
    return horizontal().stream().flatMap(x -> vertical().stream().map(y -> new Point(x, y))).collect(Collectors.toList());

  }

  @Override
  public String toString() {
    return "Rectangle{" +
            "p1=" + p1 +
            ", p2=" + p2 +
            '}';
  }
}
