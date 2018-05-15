package com.github.gaal.gergo.packagericebags;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PackageRiceBags {

    public Boolean packageRice(Integer big, Integer small, Integer goal) {

        List<Integer> bigSmall = new ArrayList<Integer>();
        bigSmall.addAll(range(big, 5));
        bigSmall.addAll(range(small,1));
        System.out.println(bigSmall);

        for (Integer i:bigSmall) {
            int remaining = goal - i;
            if(remaining == 0){
                return true;
            }
            if(remaining < 0){
                continue;
            }
            goal = remaining;
        }
        return false;
    }

    private static List<Integer> range(int times, int number){
        List<Integer> integers = new ArrayList<Integer>();

        for (int i = 1; i <= times; i++){
            integers.add(number);
        }
        return integers;
    }
}
