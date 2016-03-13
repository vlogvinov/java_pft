package ru.stqa.pft.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTest {
    @Test
    public void testPrime(){
        Assert.assertTrue(Primes.isPrimeFor(Integer.MAX_VALUE));
    }

   @Test(enabled = false)
    public void testNonPrime(){
        Assert.assertFalse(Primes.isPrimeFor(Integer.MAX_VALUE - 2));
    }

    @Test(enabled = false)
    public void testPrimeLong(){
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(Primes.isPrimeFor(n));
    }

}
