package homework2.task3;

public class Item {
    String title;
    int articleNumber;
    int price = 0;
    int  quantity;
    String colour;

    public Item (String title, int quantity, int articleNumber){
        this.title = title;
        this.quantity = quantity;
        this.articleNumber = articleNumber;
    }
    public Item (String title, int quantity, int articleNumber, String colour){
        this.title = title;
        this.articleNumber = articleNumber;
        this.quantity = quantity;
        this.colour = colour;
    }

    public Item (String title, int quantity, int articleNumber,int price, String colour){
        this.title = title;
        this.articleNumber = articleNumber;
        this.quantity = quantity;
        this.price = price;
        this.colour = colour;
    }

}
