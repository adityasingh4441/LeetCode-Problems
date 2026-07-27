class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // Increase the digit
                return digits; // No carry, return result
            }
            digits[i] = 0; // If digit is 9, make it 0 and carry continues
        }

        // If all digits were 9, create a new array
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}