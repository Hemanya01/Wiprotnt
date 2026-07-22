package HareTortoiseRace;
class RaceThread extends Thread 
{
    private static boolean raceFinished = false;
    private boolean hareSleep;
    public RaceThread(String name, boolean hareSleep) 
    {
        super(name);
        this.hareSleep = hareSleep;
    }
    public void run() 
    {
        for (int i = 1; i <= 100; i++) 
        {
            if (raceFinished)
                return;
            System.out.println(getName() + " : " + i + " meters");
            if (hareSleep && getName().equals("Hare") && i == 60) 
            {
                try 
                {
                    System.out.println("Hare is sleeping...");
                    Thread.sleep(1000);
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
            }
            try 
            {
                Thread.sleep(10);
            } 
            catch (InterruptedException e) 
            {
                return;
            }
        }
        if (!raceFinished) 
        {
            raceFinished = true;
            System.out.println();
            System.out.println(getName() + " WINS THE RACE");
            System.out.println();
        }
    }
}
public class Race 
{
    public static void main(String[] args) 
    {
        RaceThread hare = new RaceThread("Hare", true);
        RaceThread tortoise = new RaceThread("Tortoise", false);
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);
        hare.start();
        tortoise.start();
    }
}