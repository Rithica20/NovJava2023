package abstractclass;

public abstract class Page {
    // full abstraction - 100%
    //partial abstraction - 0 - 100%
    //no - abstarction - 0% abstraction



    int page_load_timeout = 5;


//	public Page() {
//		this(10);
//		System.out.println("this is page class default constructor");
//	}

//	public Page(int a) {
//		System.out.println("this is page class paramerterized constrcutor "+a);
//	}




    public abstract void url();

    public  abstract void title();


    public final static void logo() {
        System.out.println("Page----logo");
    }

    public static void footerValue() {
        System.out.println("Page----footer value");
    }


    public void search() {
        System.out.println("Page class --- search");

    }
}
