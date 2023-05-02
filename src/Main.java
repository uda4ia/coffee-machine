import java.sql.SQLOutput;

public class Main
{
    public static int[]  prices = {200, 100, 50, 75};
    public static String[] names = {"капучино", "экспрессо", " вода"};
    public static void main(String[] args) {
        System.out.println("Кофемашина");

        int value = 120;
        Product cappuchino = new Product("капучино", 200);

        System.out.println(cappuchino.getName() + " - " + cappuchino.getPrice());

        //cheсkPrices(value);
    }
    public static void cheсkPrices(int moneyAmount) {
            boolean canBayAnything = false;

            int length = Math.min(prices.length, names.length);

            for (int i = 0; i < length; i = i+ 1 ){
                if (moneyAmount >= prices[i]){
                    System.out.println("Вы можете купить " + names[i]);
                    canBayAnything = true;
                }

            }

            if (canBayAnything == false) {
                System.out.println("Недостаточно средств");
            }
    }

}

