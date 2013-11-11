package pl.japila.scalania.s99

object S99_P07 {
  def flatten(ls: Seq[Any]): Seq[Any] = ls match {
    case Nil => Nil
    case h :: t => h match {
      case Nil => Nil
      case x :: xs => x +: flatten(xs :+ flatten(t))
      case _ => h +: flatten(t)
    }
  }
}
