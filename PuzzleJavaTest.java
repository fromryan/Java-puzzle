public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();

        int[] arr1 = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(puzzle.printSumAndGreaterThan10(arr1));

        String[] arr2 = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        System.out.println(puzzle.printNameAndGreatherThan5Char(arr2));

        char[] arr3 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        puzzle.shuffleAndDisplay(arr3);

        System.out.println(puzzle.randomTen());
        System.out.println(puzzle.randomTenSorted());
        
        System.out.println(puzzle.fiveCharRandomString());
        
        System.out.println(puzzle.arrayWithRandomStr());
    }
}