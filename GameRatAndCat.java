import java.util.Scanner;

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
//Tao danh sach
        String arrRat[]={"Jerry","chuột đồng","chuột cống","chuột nhắt","chuột nhà"};

        String arrCat[]={"Tom","mèo vàng","mèo đen","mèo trắng","mèo anh"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Hãy nhập vào tên chuột bạn muốn tìm:");
        String mouse = sc.nextLine();


        for (int i = 0; i < arrRat.length; i++) {
            if (mouse == arrRat[i]) {
                System.out.println();
            }
        }

    }
}
