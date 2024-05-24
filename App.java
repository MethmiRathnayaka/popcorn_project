import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<popcornBag> popcornBags = new ArrayList<popcornBag>();
        Machine machine=new Machine(popcornBags);
        
        Thread cookerTread1=new cookerThread(machine);
        Thread cookerTread2=new cookerThread(machine);
        Thread roboThread=new roboThread(machine);


        cookerTread1.start();
        cookerTread2.start();
        
        roboThread.start();
}
}
