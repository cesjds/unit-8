// Yoav Amit

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

    public String getHexadecimal(int num) {
        int rem = 0;
        String hexaNum = "";

        // the hexadecimal system
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(num > 0)
        {
            rem = num % 16;
            hexaNum = hex[rem] + hexaNum;
            num = num / 16;
        }

        return hexaNum;
    }

    public String getOctal(int num) {
        int rem = 0;
        int octaNum = 0;
        int i = 1;

        while(num > 0){
            rem = num%8;
            octaNum +=  i * rem;
            num = num/8;
            i = i * 10;
        }

        return Integer.toString(octaNum);
    }

    public String getBinary(int num) {
        int binary[] = new int[40];
        int index = 0;
        String binaNum = "";

        while(num > 0) {
            binary[index ++] = num % 2;
            num = num / 2;
        }
        for(int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
            binaNum += binary[i];
        }

        return binaNum;
    }
}
