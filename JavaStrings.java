public class JavaStrings{
    public static void main(String[] args) {
        //NOTE: STRINGS ARE IMMUTABLE.
        //String methods always return a new string.
        //Running only a method on a string will not change the string. e.g: only name.toUpperCase() will not make name uppercase.
        String s = new String("Farhan");
        String name = "Harry"+s;

        //length() : Finding length of string
        System.out.println(name.length());

        //toUpperCase() : Returns a new string converted to lowercase from the given string
        String lowerString = name.toLowerCase();
        System.out.println(lowerString);

        //toLowerCase() : Returns a new string converted to uppercase from given string
        String upperString = name.toUpperCase();
        System.out.println(upperString);

        //trim() : Removes whitespaces
        String nonTrimmedString = "     Harry  ";
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        //substring(int beginIndex,int endIndex) : Returns substring STARTING from the specified start, 0-indexing. if endIndex not supplied, gets upto end of string. If endindex supplied, stops at endIndex-1. beginIndex is inclusive, endIndex is exclusive
        //name = "Harry"
        String newSubString = name.substring(3);
        String anotherNewSubString = name.substring(2, 4);
        System.out.println(newSubString);
        System.out.println(anotherNewSubString);

        //replace(charToReplace,charToBeReplacedWith) : Returns a new string which replaces all instances of charToReplace with charToBeReplacedWith
        String replacedString = name.replace('r','p');
        System.out.println(replacedString);
            //Also works with strings
        String replacedString2 = name.replace("rry","ier");
        System.out.println(replacedString2);
            //Also replaces single char with a string
        String replacedString3 = name.replace("r","ier");
        System.out.println(replacedString3);

        //startsWith(string) : Returns true if the string starts with string, else false
        System.out.println(name.startsWith("H"));

        //endsWith(string) : Returns true if the string ends with string, else false
        System.out.println(name.endsWith("rry"));

        //charAt(index) : Returns the character present at index, 0-indexing
        System.out.println(name.charAt(2));

        //indexOf(string) : Returns index of given string
        System.out.println(name.indexOf("arr"));

        String name2 = "Harry";
        String name3 = "NotHarry";
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

        //equalsIgnoreCase(string) : Case sensitive equals
        String name4 = "haRRy";
        System.out.println(name.equalsIgnoreCase(name4));


    
        

    }
}