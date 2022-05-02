public class Number {
    private int num;

    // default constructor
    public Number() {
        num = 0;
    }

    // parameter Constructor
    public Number(int n) {
        num = n;
    }

    // getter
    public int getNum() {
        return num;
    }
    // setter
    public void setNum(int num) {
        this.num = num;
    }

    public int getHexadecimal(int num) {
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        int rem = num % 16;
        String str= hex[rem] + str;
        num = num / 16;
        return num;
    }

    public int getOctal(int num) {
        return Integer.toOctalString(num);
    }

    public String getBinary


}
