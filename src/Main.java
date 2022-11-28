public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 3.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend *= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println(differenceWeight);


        var remDivision = secondBoxerWeight % firstBoxerWeight;
        System.out.println(remDivision);

        var totalTime = 640;
        var workingTime = 8;
        var workers = totalTime / workingTime;
        System.out.println("Всего работников в компании - " + workers + " человек");

        workers += 94;
        totalTime = workers * 8;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");
    }
}