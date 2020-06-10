package warmup;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Rectangles {
  private final Collection<Rectangle> rectangles;

  static Collection<Rectangle> random(int qty) {
    return Stream
        .generate(Rectangle::random)
        .limit(qty)
        .collect(Collectors.toList());
  }

  Rectangles() {
    this(C.RECTANGLES_COUNT);
  }

  Rectangles(int qty) {
    this.rectangles = Rectangles.random(qty);
  }

  long area() {
    return  rectangles.stream().flatMap(r->r.points().stream()).distinct().count();

  }

  public List<Rectangle> list() {


    return (List<Rectangle>) rectangles;
  }
}
