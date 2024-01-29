package basics.notify;

public class Notifications {
    public static void main(String[] args) {

boolean agreeToAcceptNotifications = true;
boolean agreeToSMS = true;
boolean agreeToEmail = true;

/*if(agreeToAcceptNotifications) {

    if (agreeToSMS){
        System.out.println("Отправляем СМС");

    }

    if (agreeToEmail){
            System.out.println("Отправляем Email");
        } else {
            System.err.println("Не можем связаться с пользователем");
        }
    }
} else {
    System.out.println("Ничего");
}*/


        // ! - логическое НЕ,
if (!agreeToAcceptNotifications) {
    System.out.println("Отправляем уведомление");
} else {
    System.out.println("Не отправляем ничего");
}

//логическое И - совпадает две проверки
        if (agreeToAcceptNotifications && agreeToSMS) {
            System.out.println("Отправляем SMS");
        } else {
            System.out.println("Не отправляем ничего");
        }


        // логическое ИЛИ
        if (agreeToSMS || agreeToEmail) {
            System.out.println("Отправляем уведомемление");
        }

        if(agreeToAcceptNotifications) {

            if (agreeToSMS && !agreeToEmail){
                System.out.println("Отправляем СМС");

            }

            if (agreeToEmail && !agreeToSMS){
                System.out.println("Отправляем Email");
            }

            if (agreeToEmail && !agreeToSMS) {
                System.out.println("Отправляем Email");
            }
            else {
                System.err.println("Не можем связаться с пользователем");
            }
        }
    }
}
