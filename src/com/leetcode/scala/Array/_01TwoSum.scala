package com.leetcode.scala.Array

import com.leetcode.java.Utils.PrintUtils
import org.junit.{Assert, Test}


/**
  * 给定一个数组，得出和为特定值的两个数的下标，
  *
  * 假设有解，假设数不重复
  *
  */
class  _01TwoSum {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var paramMap = Map[Int,Int]()
    for( i <- 0 to (nums.length-1)){
      paramMap += (nums.apply(i) -> i)
    }
    for (i <- 0 to (nums.length-1)) {
      val left = target-nums(i)
      if (paramMap.contains(left) && paramMap(left)!=i){
        return Array[Int](i,paramMap(left))
      }
    }
    Array[Int](0,0)
  }

  @Test
  def test(): Unit ={
    val nums=Array(3,2,4)
    val target=6
    PrintUtils.printArray(twoSum(nums,target))
  }



}
