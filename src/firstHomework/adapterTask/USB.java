package firstHomework.adapterTask;

public class USB implements USBable{

    String usbData = "usb data";

    @Override
    public String readUSB() {
        return usbData;
    }

    @Override
    public void writeUSB(String data) {
        usbData = data;
    }
}
