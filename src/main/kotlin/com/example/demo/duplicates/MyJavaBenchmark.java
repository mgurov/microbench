package com.example.demo.duplicates;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

import java.util.HashSet;
import java.util.Set;


public class MyJavaBenchmark {
    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    public void javaDuplicates(Blackhole blackhole) {
        boolean result = Solution.containsDuplicate(Input.largeInput);
        if (result) {
            throw new RuntimeException("Unexpectedly contained duplicate somehow...");
        }
        blackhole.consume(result);

    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    public void kotlinDuplicates(Blackhole blackhole) {
        boolean result = new KotlinSolution().containsDuplicate(Input.largeInput);
        if (result) {
            throw new RuntimeException("Unexpectedly contained duplicate somehow...");
        }
        blackhole.consume(result);

    }
}


class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> distinctMap = new HashSet<>();
        for (int num : nums) {
            if (distinctMap.contains(num)) {
                return true;
            } else {
                distinctMap.add(num);
            }
        }
        return false;
    }
}