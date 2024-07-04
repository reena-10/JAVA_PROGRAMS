package interface_;

class Image implements Printable {
     String filename;

    public Image(String filename) {
    this.filename=filename;
            }

    @Override
    public void print() {
        System.out.println("Printing image: " +filename);
    }
}

