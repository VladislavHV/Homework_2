

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("Задача №2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println("Задача №3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задание №6");
        var massaBocser1 = 78.2;
        var massaBocser2 = 82.7;
        var massaBocserGeneral = massaBocser1 + massaBocser2;
        System.out.println(massaBocserGeneral);
        var varianceBocser = massaBocser2 - massaBocser1;
        System.out.println(varianceBocser);
        System.out.println("Задача №7");
        var massaBocserResidue = massaBocser2 % massaBocser1;
        System.out.println(massaBocserResidue);
        System.out.println("Задача №8");
        var working = 640 / 8;
        System.out.println("Всего работников в компании — " + working + " человек.");
        var humans = working + 94;
        var time = humans * 8;
        System.out.println("Если в компании работает " + humans + " человека, то всего " + time + " часа работы может быть поделено между сотрудниками.");
    }
}