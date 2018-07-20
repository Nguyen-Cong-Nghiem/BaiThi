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

    public void run(int speed) {
        System.out.print("Mèo đang chạy với tốc độ: " +getSpeed());
    }

    public boolean catched(Rat rat) {
        if (getSpeed() == rat.getSpeed()) {
            return true;
        }
        return false;
    }

    public void eat(Rat rat,Rat food) {
        if (rat.getWeight() < 10) {
            System.out.println("Mum mum,chuột hơi gầy");
        } else if (rat.getWeight() > 10) {
            System.out.println("Mum mum,chuột béo đấy");
        }else
            System.out.println("Meo meo,đói");
    }
 }
