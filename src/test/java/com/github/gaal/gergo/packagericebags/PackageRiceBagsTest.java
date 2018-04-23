package com.github.gaal.gergo.packagericebags;

import org.junit.Assert;
import org.junit.Test;

public class PackageRiceBagsTest {

    private PackageRiceBags packageRiceBags = new PackageRiceBags();

    @Test
    public void returnTrue(){

        Boolean actual = packageRiceBags.packageRice(2, 1, 6);

        Assert.assertEquals(actual,packageRiceBags.packageRice(2,1,6));

    }

    @Test
    public void returnFalse(){

        Boolean actual = packageRiceBags.packageRice(2, 3, 9);

        Assert.assertEquals(actual,packageRiceBags.packageRice(2,3,6));

    }
}
