class Task {
    // Task 1.1 - football match
    public int matchScore(int realScore1, int realScore2, int score1, int score2) {
        return (realScore1 == score1) && (realScore2 == score2) ? 2
                : ((realScore1 > realScore2) && (score1 > score2))
                || ((realScore1 < realScore2) && (score1 < score2)) ? 1 : 0;
    }

    //Task 1.2 - draw a diamond
    public void drawHromb(int num) {
        int middle = num / 2;
        int temp = (num % 2 == 1) ? 0 : 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i < middle) {
                    if (j >= middle - i - temp && j <= middle + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= i - middle && j <= middle - i + num - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    //Task 1.3 - raise the number to a power
    public int powerNumber(int number, int power) {
        int result = number;
        for (int i = 0; i < power - 1; i++) {
            result *= number;
        }
        return result;
    }

    //Task 1.4 - Factorial (implemented using a recursion)
    public int factorialRecursion(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorialRecursion(x - 1);
    }

    //Task 1.4 - Factorial (implemented using a loop)
    public int factorialLoop(int x) {
        int result = 1;
        for (int i = x; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    //Task 1.4 - Fibonacci number (implemented using a recursion)
    public int fibonachiRecursion(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return fibonachiRecursion(index - 1) + fibonachiRecursion(index - 2);
    }

    //Task 1.4 - Fibonacci number (implemented using a loop)
    public int fibonachiLoop(int index) {
        int x1 = 1;
        int x2 = 1;
        int res = 0;
        if (index == 1 || index == 2) {
            return 1;
        }
        for (int i = 0; i < index - 2; i++) {
            res = x1 + x2;
            x1 = x2;
            x2 = res;
        }
        return res;
    }
}
