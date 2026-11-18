public class Utils {

    public static String printArray(int[] array) {
        String array1 = "";
        for (int i : array) {
            array1 += (i + ", ");
        }
        return array1;
    }

    public static int randomNumber(int low, int high) {
        return (int) (Math.random() * (high - low) + low);
    }

    public static double toDouble(String text) {
        double a = Double.parseDouble(text);
        return a;
    }

    public static String describeChar(char value) {
        if (Character.isDigit(value)) {
            return "digit";
        } else if (Character.isLetter(value)) {
            return "letter";
        } else {
            return "other";
        }
    }

    public static boolean isInteger(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        int start = 0;
        if (text.charAt(0) == '-') {
            if (text.length() == 1) {
                return false;
            }
            start = 1;
        }
        for (int i = start; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static Integer parseOrNull(String text) {
        if (isInteger(text)) {
            return Integer.parseInt(text);
        } else {
            return null;
        }
    }

    public static int locate(String text, char target) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isDecimal(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        int i = 0;
        if (text.charAt(0) == '-') {
            i++;
        }
        if (i >= text.length() || !Character.isDigit(text.charAt(i))) {
            return false;
        }
        int dotCount = 0;
        for (; i < text.length(); i++) {
            char current = text.charAt(i);
            if (Character.isDigit(current)) {
                continue;
            } else if (current == '.') {
                dotCount++;
                if (dotCount > 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean onlyNumAndLet(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (!Character.isLetterOrDigit(current)) {
                return false;
            }
        }
        return true;
    }

    public static int countOccurrences(String text, char target) {
        if (text == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static String reverse(String text) {
        if (text == null) {
            return null;
        }
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    public static int arrayMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        return highest;
    }

    public static int arrayMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        return lowest;
    }

    public static double average(int[] numbers, int start) {
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int i = start; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

    public static boolean contains(int[] numbers, int target) {
        if (numbers == null) {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasImproved(int[] numbers) {
        if (numbers.length <= 0) {
            return true;
        }
        for (int i = 1; i < numbers.length; i++) {
            int previous = numbers[i - 1];
            int current = numbers[i];
            if (current <= previous) {
                return false;
            }
        }
        return true;
    }

    public static int getNumber(int[] numbers, int index) {
        return numbers[index];
    }

    public static double getAverageFromArray(int[] numbers, int num1, int num2) {
        double a = getNumber(numbers, num1);
        double b = getNumber(numbers, num2);
        double average = (double) (a / b);
        return average;
    }

    public static int countOccurrences(int[] numbers, int target) {
        if (numbers == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static int sumDigits(String text) {
        if (text == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }

    public static int linearSearch(int[] numbers, int target) {
        if (numbers == null) {
            return -1;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void reverseArray(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return;
        }
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        if (arr1 == null)
            arr1 = new int[0];
        if (arr2 == null)
            arr2 = new int[0];
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    public static int[] filterEven(int[] numbers) {
        if (numbers == null) {
            return new int[0];
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        int[] evens = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens[index++] = numbers[i];
            }
        }
        return evens;
    }

    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static String maskString(String text, int start, int end, char maskChar) {
        if (text == null || start < 0 || end > text.length() || start >= end) {
            return text;
        }
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (i >= start && i < end) {
                result += maskChar;
            } else {
                result += text.charAt(i);
            }
        }
        return result;
    }

    public static int[] removeZeros(int[] numbers) {
        if (numbers == null) {
            return new int[0];
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                result[index++] = numbers[i];
            }
        }
        return result;
    }

    public static boolean allPositive(int[] numbers) {
        if (numbers == null) {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    public static String repeatString(String text, int times) {
        if (text == null || times <= 0) {
            return "";
        }
        String result = "";
        for (int i = 0; i < times; i++) {
            result += text;
        }
        return result;
    }

    public static int sumArray(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static boolean hasNegative(int[] numbers) {
        if (numbers == null) {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return true;
            }
        }
        return false;
    }

    public static int indexOfLast(int[] numbers, int target) {
        if (numbers == null) {
            return -1;
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}