package view;

public class View {

    public void display(String message) {
        System.out.println(message);
    }

    public void display(Exception e) {
        System.out.println(e.getMessage());
    }
}
