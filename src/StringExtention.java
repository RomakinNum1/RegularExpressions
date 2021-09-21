import java.util.regex.Pattern;

public class StringExtention {
    public static boolean isIP(String str)
    {
        //Pattern pattern = Pattern.compile((str), Pattern.CASE_INSENSITIVE);
        return str.matches("((\\d|[1-9]\\d|1\\d\\d|2[0-5]" +
                "[0-5])\\.)((\\d|[1-9]\\d|1\\d\\d|2[0-5][0-5])" +
                "\\.)((\\d|[1-9]\\d|1\\d\\d|2[0-5][0-5])\\.)" +
                "((2[0-5][0-5])|[1-9]\\d|1\\d\\d|\\d)$");
    }//((\d|[1-9]\d|1\d\d|2[0-5][0-5])\.){3}\2
    public static boolean isGUID(String str)
    {
        //Pattern pattern = Pattern.compile((str), Pattern.CASE_INSENSITIVE);
        return str.matches("[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}" +
                "-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12}");
    }//([a-zA-Z0-9]){8}-(\1{4})-\2-\2-\1{12}
}
