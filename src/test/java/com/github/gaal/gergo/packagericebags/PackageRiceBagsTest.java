package com.github.gaal.gergo.packagericebags;

import org.junit.Assert;
import org.junit.Test;

public class PackageRiceBagsTest {

    private PackageRiceBags packageRiceBags = new PackageRiceBags();

    @Test
    public void returnTrue(){
        Assert.assertTrue(packageRiceBags.packageRice(2,2,6));
    }
    @Test
    public void returnTrue2(){
        Assert.assertTrue(packageRiceBags.packageRice(2,1,11));
    }

    @Test
    public void returnTrue3(){
        Assert.assertTrue(packageRiceBags.packageRice(2,3,13));
    }

    @Test
    public void returnFalse(){
        Assert.assertFalse(packageRiceBags.packageRice(2,0,6));
    }
    @Test
    public void returnFalse2(){
        Assert.assertFalse(packageRiceBags.packageRice(2,1,12));
    }

    @Test
    public void returnFalse3(){
        Assert.assertFalse(packageRiceBags.packageRice(1,9,15));
    }
}
