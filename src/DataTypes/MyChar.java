package DataTypes;

public class MyChar {
    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public void isVowel(){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Given is a vowel");
        }
        System.out.println("Given is a consonant");

    }

    public static void printLowerCase(){
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(ch);
        }
    }

    public static void printUpperCase(){
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        MyChar myChar = new MyChar('a');
        myChar.isVowel();
        printLowerCase();
        printUpperCase();

    }
}
