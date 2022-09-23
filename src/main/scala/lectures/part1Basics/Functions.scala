package lectures.part1Basics

object Functions extends App{
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  //println(aFunction("A", 23))

  //Função recursiva, deve-se evitar usar loopes como while e for e usar funções recursivas para os loops
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n ==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  //println(aRepeatedFunction("ARD", 23))


  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = {
      a + b
    }
    aSmallerFunction(n, n-1)
  }

  //println(aBigFunction(5))

  // Exercises
  def greetings(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old!"
  }
  //println(greetings("Anderson", 39))

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n-1)
  }
  //println(factorial(3))

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  //println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntill(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntill(t-1)

    }
    isPrimeUntill(n/2)
  }

  println(isPrime(5))
}
