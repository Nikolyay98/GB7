package company;
public class Main {
    public static void mai(String [] args){
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мурка", 5);
        cats[1] = new Cat("Журка", 6);
        cats[2] = new Cat("Дуська", 10);
        Plate plate = new Plate(20);
        for (int cat = 0; cat < cats.length; cat++){
            cats[cat].eat(plate);
        }
        appendFoodTo(plate, 50);
        for (int cat = 0; cat < cats.length; cat++){
            cats[cat].eat(plate);
        }
    }
    static void appendFoodTo(Plate plate, int food){
        plate.increaseFood(food);
    }
}