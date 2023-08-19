
 class Main1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Check if the array length is greater than four
        if (array.length > 4) {
            // Create a new array with a length equal to the number of elements that meet the condition
            int[] newArray = new int[array.length - 4];
            int newIndex = 0;

            // Copy only the elements that meet the condition to the new array
            for (int i = 0; i < array.length; i++) {
                if (i < 4) {
                    newArray[newIndex] = array[i];
                    newIndex++;
                }
            }

            // Update the original array reference to point to the new array
            array = newArray;
        }

        // Print the updated array
        for (int num : array) {
            System.out.println(num);
        }
    }
}