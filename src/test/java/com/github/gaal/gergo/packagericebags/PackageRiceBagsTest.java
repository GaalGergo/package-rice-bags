package com.github.gaal.gergo.packagericebags;

import org.junit.Assert;
import org.junit.Test;

public class PackageRiceBagsTest {

    private PackageRiceBags packageRiceBags = new PackageRiceBags();

    @Test
    public void returnTrue(){

        Boolean actual = false;

        if (packageRiceBags.packageRice(1, 1, 6)) {
            actual = true;
        }

        Assert.assertEquals(actual,packageRiceBags.packageRice(1,1,6));

    }

    @Test
    public void returnFalse(){

        Boolean actual = true;

        if (packageRiceBags.packageRice(1, 1, 8)) {
            actual = true;
        }

        Assert.assertEquals(actual,packageRiceBags.packageRice(1,1,6));

    }
}
