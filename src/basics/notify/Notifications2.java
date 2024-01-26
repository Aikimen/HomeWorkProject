package basics.notify;

public class Notifications2 {
    public static void main(String[] args) {

        //email sms push tg call none

        String preferredWay = "sms";

        switch (preferredWay) {
            case "sms":
                System.out.println();
                break;
            case "email":
                System.out.println();
                break;
            case "tg":
                System.out.println();
                break;
            case "call":
                System.out.println();
                break;
            case "none":
                System.out.println();
                break;
            default:
                System.out.println("Нетипичное поведение");
        }

    }
}
