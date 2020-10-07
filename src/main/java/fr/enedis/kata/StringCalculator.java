package fr.enedis.kata;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || "".equals(numbers)) {
            return 0;
        }
        String[] nums = numbers.split(",");
        int total = 0;
        for (String item : nums) {
            int num = Integer.parseInt(item);
            total += num;
        }
        return total;


    }
}
