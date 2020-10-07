package fr.enedis.kata;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers) {

        int total = 0;
        List<String> negatifs = new ArrayList<>();
        if (numbers != null && !"".equals(numbers)) {
            int last = numbers.indexOf("\\n")>0?numbers.indexOf("\\n"):0;
            String separator = numbers.substring(0,last).replace("//","");
            String[] nums = "".equals(separator)?  numbers.split("\\n|,"):
                    numbers.substring(last+2).split(separator);
            for (String item : nums) {

                int num = Integer.parseInt(item);
                if(num<=1000)
                total += num;

                if(num<0){
                    negatifs.add(item);
                }

            }
        }
        if (!negatifs.isEmpty()) {
            throw new IllegalArgumentException(
                    "negatif value not allowed " +negatifs);
        }
        return total;

    }
}
