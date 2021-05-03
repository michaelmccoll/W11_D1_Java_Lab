public class Printer {
    private int pages;
    private int toner;

    public Printer(int pages){
        this.pages = pages;
        this.toner = 100;
    }

    public void Print(int pages,int copies){
        this.pages -= pages * copies;
        this.toner -= pages * copies;
    }
    public int getToner(){
        return this.toner;
    }

    public int getPages(){
        return this.pages;
    }

}
