package pl.japila.scalania.s99

object S99_P02 {
  def penultimate[T](ts: Seq[T]): T = ts match {
    case h :: t :: Nil => h
    case h :: t => penultimate(t)
  }

}
