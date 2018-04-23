package com.github.gaal.gergo.packagericebags;

import java.util.ArrayList;
import java.util.List;

public class PackageRiceBags {

    public int goalNumber;

    public Boolean packageRice(Integer big, Integer small, Integer goal) {

        for (int number = 1; number <= big; number++) {
            int bigToMultiply = number * 5;
            if (bigToMultiply % goal == 0) {
                return true;
            }
            if (bigToMultiply % goal != 0) {
                goalNumber = bigToMultiply + small;
            }
            if (goalNumber == goal) {
                return true;
            }
            number++;
        }
        return false;
    }
}
