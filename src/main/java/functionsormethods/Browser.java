package functionsormethods;

import java.util.ArrayList;

public class Browser {
    //WAF:
    //getEmployeeDevicesDetails(String employeeName)
    //you need to get the list of all the devices that employee have.
    // return the list to Admin


    public ArrayList getEmployeeDeviceDetails(String employeeName) {

        employeeName = employeeName.trim().toLowerCase(); //sahil

        ArrayList listOfDevices = new ArrayList(); //pc=0

        if (employeeName.equals("sahil")) {
            //laptop, headset, mouse
            listOfDevices.add("laptop");
            listOfDevices.add("headset");
            listOfDevices.add("mouse");
        } else if (employeeName.equals("divya")) {
            listOfDevices.add("laptop");
            listOfDevices.add("key");
        } else if (employeeName.equals("rithica")) {
            listOfDevices.add("laptop");
            listOfDevices.add("laptop stand");
        } else {
            System.out.println("Please pass the right employee name:: " + employeeName);
        }
        return listOfDevices;
    }
    public static void main(String[] args) {

        Browser b = new Browser();
        System.out.println(b.getEmployeeDeviceDetails("sahil"));

    }
}
