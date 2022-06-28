
package HerançaMu.application;

import HerançaMu.Devices.ComboDevice;
import HerançaMu.Devices.ConcretePrinter;
import HerançaMu.Devices.ConcreteScanner;

public class Program {

    
    public static void main(String[] args) {
        
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("my latter");
        p.print("My letter");
        
        System.out.println("");
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());
        
        System.out.println("");
        ComboDevice c = new ComboDevice("2080");
        c.processDoc("hay");
        c.print("hay print");
        System.out.println("Scan result: " + c.scan());
    }
    
}
