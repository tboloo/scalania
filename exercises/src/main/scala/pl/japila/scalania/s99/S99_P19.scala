package pl.japila.scalania.s99

object S99_P19 {
  def rotate[T](n: Int, ts: Seq[T]): Seq[T] = {
    if (n >= 0) {
      (ts drop n) ++ (ts take n)
    } else {
      (ts drop ts.size + n) ++ (ts take ts.size + n)
    }
  }
}
