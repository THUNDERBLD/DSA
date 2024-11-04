

public class StrBuilder { // string builder
    public static void main(String[] args) {
        
        // firstly lets see the issue with string performance
        String series = "";
        for(int i = 0; i < 26; i++){
            char ch = (char)('a'+i);
            series += " "+ch;
        } System.out.println(series);  // what is happening here is every time the 'a'+i happens and its result is added in series which will create a new object.
                                      // ie. "a" then "a b" then "a b c" then "a b c d" and so on, and every time this happened previous object is taking extra space, therefore for solving the this problem the string builder is created...
                                     // string builder is type of class just like string but ability of an arrayList for string, which let us append the new object in previous one, which is mutable unlike String which is immutable and create new object if we make some changes in it... 

        
        // String builder code
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a'+i);
            builder.append(" "+ch); // it is actually not creating new objects and taking less space then above code because string builder is mutable...
        } System.out.println(builder);
    }
}