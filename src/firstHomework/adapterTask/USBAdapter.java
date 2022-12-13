package firstHomework.adapterTask;

public class USBAdapter implements USBable{

    SDCardable sdCard;

    public USBAdapter(SDCardable sdCard){
        this.sdCard = sdCard;
    }

    @Override
    public String readUSB() {
        return sdCard.readSDC();
    }

    @Override
    public void writeUSB(String data) {
        sdCard.writeSDC(data);
    }
}
