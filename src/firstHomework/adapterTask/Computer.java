package firstHomework.adapterTask;

public class Computer {

    String info;

    public String read(USBable usbDevice){
        return usbDevice.readUSB();
    }

}
