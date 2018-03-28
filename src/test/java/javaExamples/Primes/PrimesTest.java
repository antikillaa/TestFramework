package javaExamples.Primes;

import org.junit.Test;
import org.testng.Assert;

public class PrimesTest {
    @Test
    public void testPrimes() {
        Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
    }

    @Test
    public void testNonPrimes() {
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
    }

    @Test()
    public void testPrimeLong() {
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(Primes.isPrime(n));
    }

}