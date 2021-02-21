package `type`

trait List[+T]{
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def prepend [U >: T] (x : U): List[U] = new Cons(x, this)
}

class Cons[T](val h: T, val t:List[T]) extends List[T] {
  def isEmpty : Boolean = false
  def head : T = head
  def tail : List[T] = t

}

object Nil extends List[Nothing] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new RuntimeException("no available")
  def tail: Nothing = throw new RuntimeException("no available")
}

object test {
  val test = new Cons("124", Nil)
  
  val n : List[String]= Nil
}
