package org.interview

object Committee extends App {

  /*

    In how many ways can a committee of N size be chosen from a group of people?
    Write a function that given a committee size and a group of people to choose from
    returns a list of all the combinations

  */

  combinations(3, Set('a, 'b, 'c, 'd, 'e, 'f)) foreach println

  /*

    Set('a, 'b, 'c)
    Set('a, 'b, 'd)
    Set('a, 'b, 'e)
    ..... etc.

  */


  def combinations(num: Int, source: Set[Symbol]): Set[Set[Symbol]] = ???


}