
public class Program {
    public static void main(String[] args) {
        Task task = new Task();

        //football score
        System.out.println(task.matchScore(2, 1, 2, 0));

        //draw a diamond
        task.drawHromb(5);

        //raise the number to a power
        System.out.println(task.powerNumber(-2, 5));

        //Fibonacci number - implemented using a loop
        System.out.println(task.fibonachiLoop(7));

        //Fibonacci number - implemented using a recursion
        System.out.println(task.fibonachiRecursion(7));

        //Factorial - implemented using a loop
        System.out.println(task.factorialLoop(5));

        //Factorial - implemented using a recursion
        System.out.println(task.factorialRecursion(5));

        //Sorting time
        //Sort shell = new Sort();
        //shell.shellSort(); // t ≈ 0,15 s
        /*Sort bubble = new Sort();
        bubble.bubbleSort(); // t ≈ 2 072,31 s
        Sort insertion = new Sort();
        insertion.insertionSort();// t ≈ 105,04 s
        Sort selection = new Sort();
        selection.selectionSort();// t ≈ 508,44 s
        Sort quick = new Sort();
        quick.quickSort();// t ≈ 0,09 s
        */
    }
}
