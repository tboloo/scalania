package pl.japila.scalania.s99

object S99_P22 {
  def range(from: Int, to: Int): Seq[Int] = (from, to) match {
    case (from, to) if from != to => Seq(from) ++ range(from + 1, to)
    case _ => Nil
  }
}
