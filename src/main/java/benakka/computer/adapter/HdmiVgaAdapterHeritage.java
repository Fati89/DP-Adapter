package benakka.computer.adapter;

import benakka.computer.Hdmi;
import benakka.computer.TV;
import benakka.computer.Vga;

public class HdmiVgaAdapterHeritage extends TV implements Vga {

    @Override
    public void print(String message) {
        System.out.println("Adapting ...");
        byte[] data=message.getBytes();
        super.view(data);
        System.out.println("Adapting ...");
    }

}
