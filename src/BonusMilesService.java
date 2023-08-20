public class BonusMilesService {
    public int calculate(int price) {
        int result;
        int bonus = 20;
        if (price > 0) {
            result = price / bonus;
        } else {
            result = 0;
        }
        return result;
    }
}
