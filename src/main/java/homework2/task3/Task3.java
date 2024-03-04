package homework2.task3;

public class Task3 {
    public static void main(String[] args) {
        //"Артикул - Название - цена - количество - [Цвет]"
        Item shirt = new Item("T-shirt", 5, 111111);
        System.out.println("Артикул: " + shirt.articleNumber + " Название: " + shirt.title + " Цена: " + shirt.price + " Количество: " + shirt.quantity);

        Item trousers = new Item("cargo pants", 17, 222222, 100, "green");
        System.out.println("Артикул: " + trousers.articleNumber + " Название: " + trousers.title + " Цена: " + trousers.price + " Количество: " + trousers.quantity + " Цвет: " + trousers.colour);

        Item socks = new Item("happy socks",123, 333333, 10, "white" );
        System.out.println("Артикул: " + socks.articleNumber + " Название: " + socks.title + " Цена: " + socks.price + " Количество: " + socks.quantity + " Цвет: " + socks.colour);

        Item hat = new Item("hamburg hat", 3, 444444, 250, "Gray");
        System.out.println("Артикул: " + hat.articleNumber + " Название: " + hat.title + " Цена: " + hat.price + " Количество: " + hat.quantity + " Цвет: " + hat.colour);

        Item boots = new Item("snow boots", 7, 555555, "Sand");
        System.out.println("Артикул: " + boots.articleNumber + " Название: " + boots.title + " Количество: " + boots.quantity + " Цвет: " + boots.colour);
        boots.title = "snow boots";
        boots.quantity = 7;
        boots.articleNumber = 555777;
        boots.colour = "Sand";
    }
}
