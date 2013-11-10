package pl.japila.scalania.s99

object S99_P01 {
  def last[T](ts: List[T]): T = ts match {
    case h :: Nil => h
    case h :: t => last(t)
  }

}
