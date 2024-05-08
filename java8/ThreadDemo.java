public class ThreadDemo {
    public static void main(String[] args) {
        Runnable thread1=()->{
            //this is body of the thread
            for(int i=1;i<=10;i++){
                System.out.println("value of"+ i);
                try{
                    Thread.sleep(1000)   ;
                }catch(Exception e){
                    e.printStackTrace();
                }
               
            }
        };
        Thread t=new Thread(thread1);
        t.setName("lakshay");
        t.start();
    }
}
