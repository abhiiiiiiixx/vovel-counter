import java.util.Scanner;
class Abhi {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int q = 0;
      int w = 0;
      String a1 = "Samantha examined the letter and found it contained a hidden message.";
      String a2 = a1.toLowerCase();
      String a3 = a2.replace(" ","" );
      System.out.println(a3);
    
      int b = a3.length()-1;
      System.out.println(b);

       for (int i = 0; i <= b; i++) {
        
         if (a3.charAt(i) == 'a' || a3.charAt(i) == 'e' || a3.charAt(i) == 'i' || a3.charAt(i) == 'o'
             || a3.charAt(i) == 'o') {
           q += 1;

         }
         if (a3.charAt(i) == '.') {
           b -= 1;
        }



       }
       System.out.println("there are " + q + " vovels ");
       System.out.println("there are " + (b-q) + " consonents  ");
    }   
}