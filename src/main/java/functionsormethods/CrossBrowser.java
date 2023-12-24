package functionsormethods;

public class CrossBrowser {
    //Write A Function:
    //launch a browser --> chrome//ff/safari/edge  --DONE
    //statement -- browser is launched --DONE
    //return true/false
    //launchBrowser(String browserName) -- DONE


    //    chrome -- CHROME

    public boolean launchBrowser(String browserName){

        System.out.println("launching a browser..."+browserName);

        boolean flag = true;

        switch (browserName.trim().toLowerCase()){
            case "chrome":
                System.out.println("launch browser..."+browserName);
                break;
            case "edge":
                System.out.println("launch browser..."+browserName);
                break;
            case "safari":
                System.out.println("launch browser..."+browserName);
                break;
            default:
                System.out.println("please pass the right browser name..."+browserName);
                flag = false;
        }
        return flag;
    }

    public boolean launchBrowser1(String browserName){

        System.out.println("launching a browser..."+browserName);

        // boolean flag = true;

        switch (browserName.trim().toLowerCase()){
            case "chrome":
                System.out.println("launch browser..."+browserName);
                return true;
            case "edge":
                System.out.println("launch browser..."+browserName);
                return true;
            case "safari":
                System.out.println("launch browser..."+browserName);
                return true;
            default:
                System.out.println("please pass the right browser name..."+browserName);
                return false;
        }
    }


    public static void main(String[] args) {


        CrossBrowser cb = new CrossBrowser();


//        if(cb.launchBrowser("chrome")){
//            System.out.println("TC PASS");
//        }
//        else {
//            System.out.println("TC --- FAIL");
//        }


        if(cb.launchBrowser1("chrome")){
            System.out.println("TC --- PASS");
        }
        else {
            System.out.println("TC-- FAIL");
        }



    }
}
