package task4;


import java.util.concurrent.atomic.AtomicLong;

public class RandomNumbers {
    long a, c, m;
    private AtomicLong x;
    public RandomNumbers(){
      this.a = 25214903917l;
      this.m = (long)2^48;
    }
    public RandomNumbers withSeed(long c){
        this.c = 11l;
        x = new AtomicLong(c);
        return this;
    }
    public long next() {
        return (long) ((a*x.getAndIncrement()+c) % m);
    }
}
