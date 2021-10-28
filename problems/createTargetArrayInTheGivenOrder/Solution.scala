package createTargetArrayInTheGivenOrder

// https://leetcode.com/problems/create-target-array-in-the-given-order/

import scala.collection.mutable.ArrayBuffer

object Solution {
  def createTargetArray(nums: Array[Int], index: Array[Int]): Array[Int] = {
    val output = ArrayBuffer[Int]()
    nums.indices.foreach { i =>
      output.insert(index(i), nums(i))
    }
    output.toArray
  }
}
