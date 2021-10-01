public class Solution {
    private int numerator;
    private int denominator = 1;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Solution() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Solution(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * tim uoc chung lon nhat.
     *
     * @return uoc chung lon nhat.
     */
    public int UCLN() {
        while (numerator != denominator) {
            if (numerator > denominator) numerator = numerator - denominator;
            else denominator = denominator - numerator;
        }
        return (numerator);
    }

    /**
     * rut gon phan so.
     *
     * @return phan so rut gon.
     */
    public Solution Reduce() {
        int ts = numerator;
        int ms = denominator;
        while (numerator != denominator) {
            if (numerator > denominator) {
                numerator = numerator - denominator;
            } else {
                denominator = denominator - numerator;
            }
        }
        ts = ts / numerator;
        ms = ms / numerator;
        Solution result = new Solution(ts, ms);
        return (result);
    }

    /**
     * cong phan so.
     *
     * @param ps phan so truyen vao.
     * @return tong hai phan so.
     */
    public Solution add(Solution ps) {
        int ts = numerator * ps.denominator + denominator * ps.numerator;
        int ms = denominator * ps.denominator;
        Solution result = new Solution(ts, ms);
        return (result);
    }

    /**
     * tru hai phan so.
     *
     * @param ps phan so.
     * @return hieu phan so.
     */
    public Solution subtract(Solution ps) {
        int ts = numerator * ps.denominator - denominator * ps.numerator;
        int ms = denominator * ps.denominator;
        Solution result = new Solution(ts, ms);
        return (result);
    }

    /**
     * nhan 2 phan so.
     *
     * @param ps phan so.
     * @return tich 2 phan so.
     */
    public Solution multiply(Solution ps) {
        int ts = numerator * ps.numerator;
        int ms = denominator * ps.denominator;
        Solution result = new Solution(ts, ms);
        return (result);

    }

    /**
     * chia 2 phan so.
     *
     * @param ps phan so.
     * @return thuong 2 phan so.
     */
    public Solution divide(Solution ps) {
        int ts = numerator * ps.denominator;
        int ms = denominator * ps.numerator;
        Solution result = new Solution(ts, ms);
        return (result);
    }

    /**
     * so sanh.
     *
     * @param obj phan so can so sanh.
     * @return ket qua.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            if (this.subtract(other).numerator == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

}
//Anh BAch Cuong Duong