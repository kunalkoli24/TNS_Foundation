public class P15_Switch_Case {
    public static void main(String[] args) {
        char x = 'p';
        String lang = switch (x){
          case 'a' -> "Angular";
          case 't' -> "TailwindCss";
          case 'p' -> "Python";
            default -> "Wrong Choice";
        };
        System.out.println(lang);
    }
}
