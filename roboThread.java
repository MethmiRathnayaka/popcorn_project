public class roboThread extends Thread{
    private  Machine machine;

        public roboThread(Machine machine) {
            this.machine = machine;
        }

        @Override
        public void run() {
            
            while (true) {
                
                //System.out.println("robot arm running");
                machine.take();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
        }
}
