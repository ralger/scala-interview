package org.interview

object BadNaming extends App {

  /*
    Look at the function below and the two times it is called:
      What will the output be when the application is run
   */

  def what_do_I_do(l: List[Int]): Int = l match {
    case h :: Nil => throw new Exception("This is a really bad message for an exceptopn")
    case Nil => throw new Exception("And so is this")
    case h :: n :: Nil => h
    case h :: t => what_do_I_do(t)
  }

  println(what_do_I_do(List(1,2,3,4,5,6)))

  println(what_do_I_do(List(0)))


}
