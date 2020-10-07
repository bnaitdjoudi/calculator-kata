package fr.enedis.kata;

public class StringCalculator {

    public int add(String numbers) {

        int total = 0;
        if (numbers != null && !"".equals(numbers)) {
            int last = numbers.indexOf("\\n")>0?numbers.indexOf("\\n"):0;
            String separator = numbers.substring(0,last).replace("//","");

            String[] nums = "".equals(separator)?  numbers.split("\\n|,"):
                    numbers.substring(last+2).split(separator);

            for (String item : nums) {

                int num = Integer.parseInt(item);
                total += num;
            }
        }


        return total;

    }
}
