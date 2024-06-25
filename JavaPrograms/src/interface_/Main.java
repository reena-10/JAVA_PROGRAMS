package interface_;

public class Main {
    public static void main(String[] args) {
        Printable doc = new Document("Document/Picture/Image..");
        Printable img = new Image("my_photo.jpg");

        doc.print();
        img.print();
    }
}

