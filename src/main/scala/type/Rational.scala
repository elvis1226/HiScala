package `type`

class Rational (a : Int, b : Int){
  require(b != 0, "can't be zero")

  private val g = gcd(a, b)
  val _a = a/g
  val _b = b/g

  private def gcd(a: Int, b: Int) : Int = {
    if (b == 0) a
    else gcd(b, a%b)
  }

  override def toString: String = _a + "/" + _b
  def + (r: Rational) : Rational = new Rational(_a * r._b + _b * r._a, _b * r._b)
  def + (n: Int) : Rational = new Rational(_a + _b * n, _b)
  def - (r: Rational) : Rational = new Rational(_a * r._b - _b * r._a, _b * r._b)
  def - (n: Int) : Rational = new Rational(_a - _b * n, _b)
  def * (r: Rational) : Rational = new Rational(_a * r._a , _b * r._b)
  def * (n: Int) : Rational = new Rational(_a * n, _b)
  def / (r: Rational) : Rational = this * new Rational(r._b, r._a)
  def / (n: Int) : Rational = this * new Rational(1, n)

}

object Rational {

  def main(argv: Array[String]) : Unit = {
    val v1 = new Rational(4, 8)
    val v2 = new Rational(6, 9)
    val v3 = v1 + v2
    println(v1 + " + " + v2 + " = " +v3)

    val v4 = v1-v2
    println(v1 + " - " + v2 + " = " +v4)

    val v5 = v1*v2
    println(v1 + " * " + v2 + " = " +v5)

    val v6 = v1/v2
    println(v1 + " / " + v2 + " = " +v6)

    val v7 = v1 + 2
    println(v1 + " + 2" + " = " +v7)

    val v8 = v1 - 2
    println(v1 + " - 2" + " = " +v8)

    val v9 = v1 * 2
    println(v1 + " * 2" + " = " +v9)

    val v10 = v1 / 2
    println(v1 + " / 2" + " = " +v10)

  }
}