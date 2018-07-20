public class Rat {
    private String name;
    private int weight;
    private int speed;

    public Rat() {

    }

    public Rat(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(int speed) {
        System.out.println("Chuot dang chay toc do: " + getSpeed());
    }
}
