public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = 100;
    }

    public void Drink(){
        this.volume -=10;
        if (this.volume <0){
            this.volume = 0;
        }
    }

    public void Empty(){
        this.volume = 0;
    }

    public void Fill(){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

}
