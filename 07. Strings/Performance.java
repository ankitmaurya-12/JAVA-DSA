public class Performance {
    public static void main(String[] args) {

        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+ i);              //it will print all a to z
            System.out.println(ch);
            series = series + ch;
        }

        System.out.println(series);
    }
}
