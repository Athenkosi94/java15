public class Main {
    public static void main(String[] args) {
        String str1 = "Limpopo is far away from gauteng";
        String str2 = "Mpumalanga is the biggest province in South Africa";
        boolean equals1 = str1.length()==str2.length();

        System.out.println("the index of the letter 's' in South Africa:" + str2.indexOf("s", 28));
    System.out.println("The index of the letter 's' in South Africa: " + str2.substring(17,35));

    if(str1.length()==str2.length()) {
        System.out.println(equals1);
    }
    else
    {
        System.out.println(!equals1);
    }
    System.out.println("The index of the beginning of the word 'away' in string 1"+ str1.indexOf("a", 13));
    System.out.println("The index of the last occurrence of word 'in' in string 2" + str2.lastIndexOf("in"));
    }
}