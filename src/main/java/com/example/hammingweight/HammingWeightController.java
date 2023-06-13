package com.example.hammingweight;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class HammingWeightController {
    private String previousString;

    @RequestMapping("/api/hamming/previous")
    public int getPreviousHammingWeight() {
        if (previousString == null) {
            return 0;
        } else {
            return calculateHammingWeight(previousString);
        }
    }

    @RequestMapping("/api/hamming")
    public int getHammingWeight(@RequestParam("string") String string) {
        previousString = string;
        return calculateHammingWeight(string);
    }

    private int calculateHammingWeight(String string) {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c != '0') {
                count++;
            }
        }
        return count;
    }
}
