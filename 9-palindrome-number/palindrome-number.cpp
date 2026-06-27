class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        long long rev = 0;
        int orig = x;

        while (x > 0) {
            int lastDigit = x % 10;
            rev = (rev * 10) + lastDigit;
            x = x / 10;
        }

        return orig == rev;
    }
};