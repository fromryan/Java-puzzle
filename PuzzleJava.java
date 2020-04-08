import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    
    public ArrayList printSumAndGreaterThan10(int[] arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(arr[i]>10) {
                result.add(arr[i]);
            }
        }
        System.out.println(sum);
        return result;
    }

    public ArrayList printNameAndGreatherThan5Char(String[] arr) {
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> shuffleArr = new ArrayList<String>();
        Collections.addAll(shuffleArr, arr); //converting an array to arraylist

        Collections.shuffle(shuffleArr);
        System.out.println(shuffleArr.get(0));

        for(int i=0; i<arr.length; i++) {
            if(arr[i].length()>5) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public void shuffleAndDisplay(char[] arr) {
        // ArrayList<String> shuffleArr = new ArrayList<String>();
        ArrayList<Character> charList = new ArrayList<Character>();
        for(char ch : arr) {
            charList.add(ch);
        }
        System.out.println(charList); //check if Character list is created from char array

        Collections.shuffle(charList);
        System.out.println(charList);
        System.out.println(charList.get(charList.size()-1));
        
        ArrayList<Character> vowelsList = new ArrayList<Character>();
        char[] vowelsArray = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowelsArray) {
            vowelsList.add(vowel);
        }
        
        if(vowelsList.contains(charList.get(charList.size()-1))) {
            System.out.println("This letter is a vowel.");
        }
        else {
            System.out.println("This letter is not a vowel.");
        }
    }

    public ArrayList randomTen() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i=0; i<=9; i++) {
            result.add(rand.nextInt(46)+55);
        }
        return result;
    }

    public ArrayList randomTenSorted() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Random random = new Random();
        for(int i=0; i<=9; i++) {
            result.add(random.nextInt(46)+55);
        }
        Collections.sort(result);
        return result;
    }

    public String fiveCharRandomString() {
        String charStr = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomStr = new StringBuilder();
        Random random = new Random();
        while(randomStr.length() < 5) {
            int index = (int) (random.nextFloat() * charStr.length());
            randomStr.append(charStr.charAt(index));
        }
        return randomStr.toString();
    }

    public ArrayList arrayWithRandomStr() {
        ArrayList<String> result = new ArrayList<String>();
        for(int i=0; i<10; i++) {
            result.add(fiveCharRandomString());
        }
        return result;
    }
}