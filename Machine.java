import java.util.ArrayList;

public class Machine {
    ArrayList<popcornBag> popcornBags;

    public Machine (ArrayList<popcornBag> popcornBags){
        this.popcornBags=popcornBags;
    }
   
    public synchronized void cook(){
        
    
            while (popcornBags.size()>=3) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            
        }
            popcornBags.add(new popcornBag());
            
            System.out.println(Thread.currentThread().getName()+" produssed a popcorn bag. Now "+popcornBags.size()+" popcorn bags available");
            notify();
            }
    public synchronized void take(){
                //System.out.println("robot arm running");
                while (popcornBags.size()<=0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                    popcornBags.remove(popcornBags.get(0));
                    System.out.println(Thread.currentThread().getName()+" taken a popcorn bag. Now "+popcornBags.size()+" popcorn bags available");
                notify();
        
            }
}
