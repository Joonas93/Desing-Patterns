package tehtävä21;



/* Complex parts */

class CPU {
    public void freeze() { System.out.println("Processor freezed");}
    public void jump(long position) { System.out.println("Jumping to " + position);}
    public void execute() { System.out.print("Executing.."); }
}

class HardDrive {
    public byte[] read(long lba, int size) {
    	byte[] b = new byte[size];
    	byte forloop = 0;
    	for(int i = 0; i<size; i++){

    	b[i] = forloop ;
    	forloop++;
    		}
    return b;
    }
}

class Memory {
    public void load(long position, byte[] data) { for(byte b : data){ System.out.println("byte: " +b);}}
}

/* Facade */

class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;
    final long BOOT_ADDRESS = 343223423;
    final long BOOT_SECTOR = 231;
    final int SECTOR_SIZE = 32;
    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();

        

    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}

/* Client */

public class You {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }

}

