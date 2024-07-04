package interface_;

class Document implements Printable {
    String content;

    public Document(String content) {
    	this.content=content;
        	    }

    public void print() {
        System.out.println("Printing document:");
        System.out.println(content);
    }
}


