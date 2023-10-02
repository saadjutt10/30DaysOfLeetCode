class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1; // Start with a carry of 1 to add 1 to the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10; // Update the current digit
            carry = sum / 10; // Update the carry for the next iteration
        }
        
        // If there's still a carry after the loop, we need to expand the array
        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1; // Set the first digit to 1
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        } else {
            return digits;
        }
    }
}
