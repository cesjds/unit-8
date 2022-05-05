// Yoav Amit

public class Number implements Comparable<Number> {
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
    public int getDecimal() {
        return num;
    }
    // setter
    public void setDecimal(int num) {
        this.num = num;
    }

    public String getHexadecimal() {
        int rem = 0;
        String hexaNum = "";
        int currentNum = num;

        // the hexadecimal system
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        if (num == 0) {
            return "0";
        }
        else {
            while (currentNum > 0) {
                rem = currentNum % 16;
                hexaNum = hex[rem] + hexaNum;
                currentNum = currentNum / 16;
            }

            return hexaNum;
        }
    }

    public String getOctal() {
        int rem = 0;
        int octaNum = 0;
        int i = 1;
        int currentNum = num;

        while(currentNum > 0){
            rem = currentNum % 8;
            octaNum +=  i * rem;
            currentNum = currentNum/8;
            i = i * 10;
        }

        return Integer.toString(octaNum);
    }

    public String getBinary() {
        int binary[] = new int[40];
        int index = 0;
        String binaNum = "";
        int currentNum = num;

        if (num == 0) {
            return "0";
        }
        else {
            while (currentNum > 0) {
                binary[index++] = currentNum % 2;
                currentNum = currentNum / 2;
            }
            for (int i = index - 1; i >= 0; i--) {
                binaNum += binary[i];
            }
            return binaNum;
        }
    }

    @Override
    public String toString() {
        return "decimal: " + getDecimal() + "\n" +
                "binary: " + getBinary() + "\n" +
                "octal: " + getOctal() + "\n" +
                "hexadecimal: " + getHexadecimal();
    }

    @Override
    public int compareTo(Number o) {
        return num - o.getDecimal();
    }
}
