package pl.japila.scalania.s99

object S99_P15 {
  def duplicateN[T](n: Int, ts: Seq[T]): Seq[T] = {
    for {
      e <- ts
      i <- 1 to n
    } yield e
  }
}
