// Using the Java language, have the function ThirdGreatest(strArr)
// take the array of strings stored in strArr and return the third largest word within in.
// So for example: if strArr is ["hello", "world", "before", "all"]
// your output should be "world" because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain letters.

// use the main method only for calling the function where your logic lies. :-)
public class third_largest {
    public static void main(String[] args) {
system.out.println(max);
    }

    public static String ThirdGreatest(String[] array) {
        string[] myList = ["john","martin","dan","amos"];//myList written in array format
        string max = myList[0];   //assigning an object to my array
        for(int i = 0; i < myList.length; i++){ //looping through my array checking for the length
            if (myList[i] > max) max = myList[i];  //declaring the max length in my array
        }
    }
}