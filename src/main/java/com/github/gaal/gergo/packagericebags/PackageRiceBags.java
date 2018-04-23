package com.github.gaal.gergo.packagericebags;

public class PackageRiceBags {

    public int smallNumber = 1;
    public int bigNumber = 5;

    public Boolean packageRice(Integer big, Integer small, Integer goal){

        int bigToMultiply = bigNumber * big;
        int smallToMultiply = smallNumber * small;

       if( bigToMultiply + smallToMultiply == goal){
           return true;
       }
        return false;
    }
}
