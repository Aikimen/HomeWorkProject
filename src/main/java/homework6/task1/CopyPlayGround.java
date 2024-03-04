package homework6.task1;

public class CopyPlayGround {
    public static void main(String[] args) {
        Copier copy = new Copier();
        try {
            Copier.copyTextFile("C:\\Users\\MyNew\\IdeaProjects\\HomeWorkProject\\target\\classes\\info.txt","C:\\Users\\MyNew\\IdeaProjects\\HomeWorkProject\\target\\classes\\info1.txt");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }

    }
}
