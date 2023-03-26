

public class Notebook implements Comparable<Notebook>{
    private int cost;
    public int ram;
    public int core;
    public Notebook(int cost,int ram, int core){
        this.cost = cost;
        this.ram = ram;
        this.core =core;
    }

    @Override
    public int compareTo(Notebook o){
        return cost - o.cost;
    }

    public String toString(){
        return "[ Цена = "+ cost + " Память =" + ram + " Ядра = "  + core +"]" ;
    }
}
