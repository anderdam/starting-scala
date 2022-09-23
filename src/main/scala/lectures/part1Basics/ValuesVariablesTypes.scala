package lectures.part1Basics

object ValuesVariablesTypes extends App {
  // VALs are immutable, like const in js
  // Compiler can infer types
  val x: Int = 42
  val aString: String = "hello"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aShort: Short = 4613
  val aLong: Long = 5465486468465468746L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //Variables
  var aVariable: Int = 4
  aVariable = 5
}
