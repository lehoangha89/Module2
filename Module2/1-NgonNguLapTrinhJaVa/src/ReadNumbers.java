public class ReadNumbers {
    public static void main(String[] args) {
​
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int number = sc.nextInt();
        int a = (int) (Math.round(number / 100));
        int b = (int) (Math.round(number / 10) - a * 10);
        int c = number - 100 * a - 10 * b;
        String aStr = "", bStr = "", cStr = "";
​
        switch (a) {
            case 0:
                aStr = "";
                break;
            case 1:
                aStr = "One hundred";
                break;
            case 2:
                aStr = "Two hundred";
                break;
            case 3:
                aStr = "Three hundred";
                break;
            case 4:
                aStr = "Four hundred";
                break;
            case 5:
                aStr = "Five hundred";
                break;
            case 6:
                aStr = "Six hundred";
                break;
            case 7:
                aStr = "Seven hundred";
                break;
            case 8:
                aStr = "Eight hundred";
                break;
            case 9:
                aStr = "Nine hundred";
                break;
​
        }
​
        switch (b) {
            case 0:
                bStr = "";
                break;
            case 1:
                bStr = "";
                switch (c) {
                    case 0:
                        cStr = "ten";
                        break;
                    case 1:
                        cStr = "Eleven";
                        break;
                    case 2:
                        cStr = "Twelve";
                        break;
                    case 3:
                        cStr = "thirteen";
                        break;
                    case 4:
                        cStr = "fourteen";
                        break;
                    case 5:
                        cStr = "Fifteen";
                        break;
                    case 6:
                        cStr = "Sixteen";
                        break;
                    case 7:
                        cStr = "Seventeen";
                        break;
                    case 8:
                        cStr = "Eightteen";
                        break;
                    case 9:
                        cStr = "Nineteen";
                        break;
                }
​
​
            case 2:
                bStr = "Twenty";
                break;
            case 3:
                bStr = "Thirty";
                break;
            case 4:
                bStr = "Forty";
                break;
            case 5:
                bStr = "fifty";
                break;
            case 6:
                bStr = "Sixty";
                break;
            case 7:
                bStr = "Seventy";
                break;
            case 8:
                bStr = "Eighty";
                break;
            case 9:
                bStr = "Ninety";
                break;
​
        }
​
        if (b != 1) {
            switch (c) {
                case 0:
                    cStr = "";
                    break;
                case 1:
                    cStr = "One";
                    break;
                case 2:
                    cStr = "Two";
                    break;
                case 3:
                    cStr = "three";
                    break;
                case 4:
                    cStr = "four";
                    break;
                case 5:
                    cStr = "Five";
                    break;
                case 6:
                    cStr = "Six";
                    break;
                case 7:
                    cStr = "Seven";
                    break;
                case 8:
                    cStr = "Eight";
                    break;
                case 9:
                    cStr = "Nine";
                    break;
​
            }
        }
        if (aStr.equals("")) {
            if (bStr.equals("")) {
                System.out.print(cStr);
            } else {
                System.out.print(bStr + " " + cStr);
            }
        } else {
            if (bStr.equals("")) {
                if (cStr.equals("")) {
                    System.out.print(aStr);
                } else {
                    System.out.print(aStr + " and " + cStr);
                }
            } else {
                System.out.print(aStr + " and " + bStr + " " + cStr);
            }
        }
​
    }
}

