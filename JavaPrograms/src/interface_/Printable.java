package interface_;

public interface Printable {
	
	    void print();
	}

	class Document implements Printable {
	    private String content;

	    public Document(String content) {
	        this.content = content;
	    }

	    @Override
	    public void print() {
	        System.out.println("Printing document:");
	        System.out.println(content);
	    }
	}


