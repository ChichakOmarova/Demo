//public class Starship {
//    private String starName;
//    private int velocity;
//    private int fuellevel ;
//
//    public Starship(String starName, int velocity, int fuellevel) {
//        this.starName = starName;
//        this.velocity = velocity;
//        this.fuellevel = fuellevel;
//
//    }
//    public String getStarName() {
//        return starName;
//    }
//    public void setStarName(String starName) {
//        this.starName = starName;
//    }
//    public int getVelocity() {
//        return velocity;
//    }
//    public void setVelocity(int velocity) {
//        this.velocity = velocity;
//    }
//    public int getFuellevel() {
//        return fuellevel;
//    }
//    public void setFuellevel(int fuellevel) {
//        this.fuellevel = fuellevel;
//    }
//    public String launch() {
//        if(fuellevel > 0){
//            return "Starship" + starName + " is launching." ;}
//        else  {
//            return "Not enough fuel to launc." ;}
//    }
//    public String land() {
//        if(velocity > 0){
//            return "Starship" + starName + " has landed safely" ;}
//        else  {
//            return "Starship is already landed." ;}
//    }
//    public String refuel(int amount) {
//        fuellevel -= amount;
//        return "Starship " + starName + " refueled by" + amount+ " fuellevel " + fuellevel;
//    }
//
//
//}
