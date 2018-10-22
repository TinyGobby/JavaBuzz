public class JavaBuzz {
    public String evaluate(int input) {
        if(input % 15 == 0) return "JavaBuzz";
        else if(input % 3 == 0) return "Java";
        else if(input % 5 == 0) return "Buzz";
        else return Integer.toString(input);
    }
}
