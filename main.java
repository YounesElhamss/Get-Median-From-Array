import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    double[] arr = {1,2,3,4,5,6,7};

    System.out.println(median(arr));

    double[] arr2 = {1,2,3,4,5,6};

    System.out.println(median(arr2));
      
      
  }

  public static double median(double[] arr) {
    Arrays.sort(arr);
    if (arr.length % 2 == 0.0) {
      return ((arr.length / 2) + ((arr.length / 2) + 1.0)) / 2;
    } else {
      return (arr.length + 1) / 2;
    }
  }
}
