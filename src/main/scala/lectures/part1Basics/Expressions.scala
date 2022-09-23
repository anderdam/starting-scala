package lectures.part1Basics

object Expressions extends App{
  val x = 1 + 2 // Right side is a expression

  // EVERYTHING in Scala is a Expression!
  var aVariable = 0
  val aWeirdValue = (aVariable = 3) // Unit == void
  // side efects? println (), whiles, reassigning

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }



}
