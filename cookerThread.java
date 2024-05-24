public class cookerThread extends Thread{
    private Machine machine;

        public cookerThread(Machine machine) {
            this.machine = machine;
        }

        @Override
        public void run() {
           
            while (true) {
                //System.out.println(Thread.currentThread().getName()+" running");
                machine.cook();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
        }
}
