public class Water_bottle {
    private int water;

    public Water_bottle(){
        this.water = 100;
    }

    public int getWater() {
        return water;
    }

    public int refillWater(){
        this.water = 100;
        return water;
    }
    public int drink(){
        int sip = 10;
        water = water-sip;
        return water;

    }
    public int empty(){
        water = 0;
        return water;
    }
}
