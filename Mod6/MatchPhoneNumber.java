public class MatchPhoneNumber {

    public static boolean isValidPhoneNumber(String phone) {
        String regex = "(\\(\\d{3}\\) )?\\d{3}-\\d{4}";
        return phone.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("(609) 555-1234"));
        System.out.println(isValidPhoneNumber("555-1234"));
        System.out.println(isValidPhoneNumber("555-123"));
        System.out.println(isValidPhoneNumber("609-555-1234"));
    }
}
