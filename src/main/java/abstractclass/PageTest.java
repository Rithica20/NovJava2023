package abstractclass;

public class PageTest {
    public static void main(String[] args) {
        //Page p1 = new Page(); we cannot create a object for a abstarct class



        LoginPage lp = new LoginPage(10);

        //default constructor of parent
        //parent class para const.
        //LoginPage para const.



//		lp.title(); //Login page title
//		lp.url(); //Login page url
//		lp.search(); //Login page search
//		LoginPage.logo(); //page logo
//		LoginPage.footerValue(); //page footer



//		System.out.println("-------------------------");
//
//		Page p = new LoginPage();
//
//		p.title();
//		p.url();
//		p.search();
//		Page.logo();
//		Page.footerValue();
//
//
//		p.page_load_timeout = 100;
//
//		System.out.println(p.page_load_timeout);
    }

}
