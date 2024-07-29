public class JavaStrings{
    public static void main(String[] args) {
        //NOTE: STRINGS ARE IMMUTABLE.
        //String methods always return a new string.
        //Running only a method on a string will not change the string. e.g: only name.toUpperCase() will not make name uppercase.
        String name = new String("Farhan");
        name = "Harry";

        //length() : Finding length of string
        System.out.println("Length: "+name.length());

        //toUpperCase() : Returns a new string converted to lowercase from the given string
        String lowerString = name.toLowerCase();
        System.out.println("Lower Case: "+lowerString);

        //toLowerCase() : Returns a new string converted to uppercase from given string
        String upperString = name.toUpperCase();
        System.out.println("Upper Case: "+upperString);

        //trim() : Removes whitespaces
        String nonTrimmedString = "     Harry  ";
        String trimmedString = nonTrimmedString.trim();
        System.out.println("Trimmed String: "+trimmedString);

        //substring(int beginIndex,int endIndex) : Returns substring STARTING from the specified start, 0-indexing. if endIndex not supplied, gets upto end of string. If endindex supplied, stops at endIndex-1. beginIndex is inclusive, endIndex is exclusive
        //name = "Harry"
        String newSubString = name.substring(3);
        String anotherNewSubString = name.substring(2, 4);
        System.out.println("Substring: "+newSubString);
        System.out.println("Another Substring: "+anotherNewSubString);

        //replace(charToReplace,charToBeReplacedWith) : Returns a new string which replaces all instances of charToReplace with charToBeReplacedWith
        String replacedString = name.replace('r','p');
        System.out.println("Replaced 'r' with 'p': "+replacedString);
            //Also works with strings
        String replacedString2 = name.replace("rry","ier");
        System.out.println("Replaced 'rry' with 'ier': "+replacedString2);
            //Also replaces single char with a string
        String replacedString3 = name.replace("r","ier");
        System.out.println("Replaced 'r' with 'ier': "+replacedString3);

        //startsWith(string) : Returns true if the string starts with string, else false
        System.out.println("Does name string with H? "+name.startsWith("H"));

        //endsWith(string) : Returns true if the string ends with string, else false
        System.out.println("Does name end with rry? "+name.endsWith("rry"));

        //charAt(index) : Returns the character present at index, 0-indexing
        System.out.println("Character at index 2: "+name.charAt(2));

        //indexOf(string) : Returns index of given string
        System.out.println("Index of arr is: "+name.indexOf("arr"));

        String name2 = "Harry";
        String name3 = "NotHarry";
        System.out.println("name = name2? "+name.equals(name2));
        System.out.println("name = name3? "+name.equals(name3));

        //equalsIgnoreCase(string) : Case sensitive equals
        String name4 = "haRRy";
        System.out.println("name = name4? (case insensitive) "+name.equalsIgnoreCase(name4));


    
        

    }
}