class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int pointerA = a.length() - 1;
        int pointerB = b.length() - 1;
        int carry = 0;
        
        while (pointerA >= 0 || pointerB >= 0) {
            int digitSum = carry;
            
            if (pointerA >= 0) {
                digitSum += a.charAt(pointerA) - '0';
                pointerA--;
            }
            
            if (pointerB >= 0) {
                digitSum += b.charAt(pointerB) - '0';
                pointerB--;
            }
            
            sb.append(digitSum % 2);
            carry = digitSum / 2;
        }
        
        if (carry == 1) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
