package benakka.computer.adapter;

import benakka.computer.Hdmi;
import benakka.computer.TV;
import benakka.computer.Vga;

public class HdmiVgaAdapter implements Vga {

    private Hdmi hdmi;

    @Override
    public void print(String message) {
        System.out.println("Adapting ...");
        byte[] data=message.getBytes();
        hdmi.view(data);
        System.out.println("Adapting ...");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
