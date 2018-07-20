public class Cat {
    private String name;
    private int speed;


    public Cat() {

    }

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String run() {
        return("Mèo đang chạy với tốc độ: " +getSpeed());
    }

    public boolean catched(Rat rat) {
        if (getSpeed() == rat.getSpeed()) {
            return true;
        }
        return false;
    }

    public String eat(Rat rat) {
        if (rat.getWeight() < 10) {
            return ("Mum mum,chuột hơi gầy.");
        } else if (rat.getWeight() > 10) {
            return ("Mum mum,chuột béo đấy.");
        }else
            return ("Meo meo,đói.");
    }
 }
