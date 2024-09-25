//TC-O(n)
//SC-O(n),The space complexity is determined by the depth of the recursion
/*If the year is divisible by 4, it might be a leap year.
If the year is divisible by 100, it is not a leap year, unless:
If the year is divisible by 400, then it is a leap year.*/


class leap {

    public static void main(String[] args) {
        int n = 2012;
        
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
            System.out.println("LEAP");
        } else {
            System.out.println("NOT");
        }
    }
}

