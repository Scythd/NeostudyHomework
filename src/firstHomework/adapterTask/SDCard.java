package firstHomework.adapterTask;

public class SDCard implements SDCardable{

    String sdcData = "sd card data";

    @Override
    public String readSDC() {
        return sdcData;
    }

    @Override
    public void writeSDC(String data) {
        sdcData = data;
    }
}
