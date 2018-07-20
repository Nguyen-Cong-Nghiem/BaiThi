public class GameRatAndCat {
    public static void main(String[] args) {
        Rat rat = new Rat();
        rat.setName("Jerry");
        System.out.println("Chuột tên là: " + rat.getName());
        rat.setSpeed(10);
        System.out.println(rat.run());
        rat.setWeight(13);
        System.out.println("Chuột nặng số cân là: " + rat.getWeight());
        Cat cat = new Cat();
        cat.setName("Tom");
        System.out.println("Mèo tên là: " + cat.getName());
        cat.setSpeed(10);
        System.out.println(cat.run());

        System.out.println("Mèo đuổi chuột!!!!!!");
        System.out.print("Mèo bắt được chuột không?: " + cat.catched(rat));
        System.out.println("\n" +"Haha,bắt được chuột rồi: " +  cat.eat(rat));




    }
}
