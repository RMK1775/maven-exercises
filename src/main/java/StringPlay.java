import org.apache.commons.lang3.StringUtils;

public class StringPlay {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please enter a number: ");
        System.out.println(StringUtils.isNumeric(input.getString()));
        System.out.println("Please enter some words: ");
        System.out.println(StringUtils.swapCase(input.getString()));
        System.out.println("Another phrase please: ");
        System.out.println(StringUtils.reverse(input.getString()));
    }
}
