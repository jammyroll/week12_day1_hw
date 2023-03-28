public class Printer {
    private int tonner;

    public Printer(){
        this.tonner=100;
    }

    public String print(int a, int b){
        if(a>b){
            a = a-b;
            tonner = tonner-b;
            if (tonner <= 0){
                return "Add more tonner";
            }
            return String.format("there are %d pages left",a);

        }

           return ("Add more pages");

    }
}
