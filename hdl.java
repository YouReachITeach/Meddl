public class hdl {

    private static void drawHeart() {
        String redColor = "\u001B[31m"; // Red color ANSI escape code
        String resetColor = "\u001B[0m"; // Reset color ANSI escape code

        System.out.println(redColor + "  ***   ***    " + resetColor);
        System.out.println(redColor + "****** ******   " + resetColor);
        System.out.println(redColor + "**************  " + resetColor);
        System.out.println(redColor + "**************  " + resetColor);
        System.out.println(redColor + " ************   " + resetColor);
        System.out.println(redColor + "  **********    " + resetColor);
        System.out.println(redColor + "    ******      " + resetColor);
        System.out.println(redColor + "      **        " + resetColor);

        System.out.println( "    hdl <3");
    }


    public static void main(String[] args) {
        drawHeart();
    }
}
