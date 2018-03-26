package javaExamples.ifelse;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DiscriminantTest {
    @Test
    public void test0() {
        Discriminant e = new Discriminant(1, 1, 1);
        Assert.assertEquals(e.rootNumber(), 0);
    }

    @Test
    public void test1() {
        Discriminant e = new Discriminant(1, 2, 1);
        Assert.assertEquals(e.rootNumber(), 1);
    }

    @Test
    public void test2() {
        Discriminant e = new Discriminant(1, 5, 6);
        Assert.assertEquals(e.rootNumber(), 2);
    }
}