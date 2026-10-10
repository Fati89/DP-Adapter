package benakka;

import benakka.computer.SuperVP;
import benakka.computer.TV;
import benakka.computer.adapter.HdmiVgaAdapter;
import benakka.computer.Ecran;
import benakka.computer.UniteCentre;
import benakka.computer.adapter.HdmiVgaAdapterHeritage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        UniteCentre uniteCentre = new UniteCentre();
        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour");

        // composition
        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        uniteCentre.print("Bonjour TV");

        // heritage
        HdmiVgaAdapterHeritage hdmiVgaAdapterH=new HdmiVgaAdapterHeritage();

        uniteCentre.setVga(hdmiVgaAdapterH);
        uniteCentre.print("Bonjour TV Heritage");

        uniteCentre.setVga(new SuperVP());
        uniteCentre.print("Hello");

        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("Bonsoir");
    }
}
