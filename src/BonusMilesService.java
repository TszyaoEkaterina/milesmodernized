public class BonusMilesService {
    public int calculate (int price) {
        int rublePerMile = 20;
        int miles = price / rublePerMile;
        return miles;

    }
}
