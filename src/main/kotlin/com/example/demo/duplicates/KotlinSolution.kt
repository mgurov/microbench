package com.example.demo.duplicates

class KotlinSolution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val distinctMap: MutableSet<Int> = HashSet()
        for (num in nums) {
            if (distinctMap.contains(num)) {
                return true
            } else {
                distinctMap.add(num)
            }
        }
        return false
    }
}