/**************************************DESCRIPTION EXERCISES*****************************************************
Have the function ArrayChallenge(arr) take the array of numbers stored in arr and return the number that appears most frequently (the mode). For example: if arr contains [10, 4, 5, 2, 4] the output should be 4. If there is more than one mode return the one that appeared in the array first (ie. [5, 10, 10, 6, 5] should return 5 because it appeared first). If there is no mode return -1. The array will not be empty.
*****************************************************************************************************************/
import java.util.*; 
import java.io.*;

class Main {

  public static int ArrayChallenge(int[] arr) {
    Map<Integer, Integer> frequency = new LinkedHashMap<>();
    int maxFrequency = 0;
    int mode = -1;

    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      frequency.put(num, frequency.getOrDefault(num, 0) + 1);

      if (frequency.get(num) > maxFrequency || (frequency.get(num) == maxFrequency && num == arr[0])) {
        maxFrequency = frequency.get(num);
        mode = num;
      }
    }

    if (maxFrequency == 1) {
      mode = -1;
    }

    return mode;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] arr = Arrays.stream(s.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
    System.out.println(ArrayChallenge(arr));
  }

}
