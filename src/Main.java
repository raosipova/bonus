//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticketCost = 9000;
        int bonusScale = 20;
        int bonusMile = ticketCost / bonusScale;
        System.out.println("Если мы купим билет" + ticketCost + "руб. , Наш бонус составит" + bonusMile + "бонусных миль.");
    }

}