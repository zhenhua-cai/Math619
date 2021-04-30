package net.stevencai.gcd;

import org.junit.Assert;
import org.junit.Test;

public class EuclidGCDTest {
    @Test
    public void gcd1(){
        int a = 200;
        int b =25;
        Assert.assertEquals(25, EuclidGCD.gcd(a, b));
    }
    @Test
    public void gcd2(){
        int a = 200;
        int b =24;
        Assert.assertEquals(8, EuclidGCD.gcd(a, b));
    }
    @Test
    public void gcd3(){
        int a = 200;
        int b =50;
        Assert.assertEquals(50, EuclidGCD.gcd(a, b));
    }
    @Test
    public void gcd4(){
        int a = 20;
        int b =250;
        Assert.assertEquals(10, EuclidGCD.gcd(a, b));
    }
    @Test
    public void gcd5(){
        int a = 25;
        int b =103;
        Assert.assertEquals(1, EuclidGCD.gcd(a, b));
    }
    @Test
    public void gcd6(){
        int a = -25;
        int b =103;
        Assert.assertEquals(1, EuclidGCD.gcd(a, b));
    }

    @Test
    public void gcd7(){
        int a = 20;
        int b =-250;
        Assert.assertEquals(10, EuclidGCD.gcd(a, b));
    }

    @Test
    public void gcd8(){
        Assert.assertEquals(2, EuclidGCD.gcd(-20,250,10,6,8));
    }

    @Test
    public void lcm1(){
        Assert.assertEquals(24, EuclidGCD.lcm(6,8));
    }
    @Test
    public void lcm2(){
        Assert.assertEquals(16, EuclidGCD.lcm(16,8));
    }
    @Test
    public void lcm3(){
        Assert.assertEquals(112, EuclidGCD.lcm(16,28));
    }
}
