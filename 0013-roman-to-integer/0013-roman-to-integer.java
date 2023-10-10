class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char curr = s.charAt(i);
            if (i > 0) {
                char prev = s.charAt(i - 1);
                if (prev == 'I' && (curr == 'V' || curr == 'X')) {
                    sum += (curr == 'V') ? 3 : 8;
                    continue;
                } else if (prev == 'X' && (curr == 'L' || curr == 'C')) {
                    sum += (curr == 'L') ? 30 : 80;
                    continue;
                } else if (prev == 'C' && (curr == 'D' || curr == 'M')) {
                    sum += (curr == 'D') ? 300 : 800;
                    continue;
                }
            }
            
            // Handle non-subtractive notation
            switch (curr) {
                case 'I': sum += 1; break;
                case 'V': sum += 5; break;
                case 'X': sum += 10; break;
                case 'L': sum += 50; break;
                case 'C': sum += 100; break;
                case 'D': sum += 500; break;
                case 'M': sum += 1000; break;
                default:
                    // Handle invalid characters here if needed
                    break;
            }
        }
        return sum;
    }
}
