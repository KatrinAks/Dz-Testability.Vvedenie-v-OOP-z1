public class BonusMilesService {

    public int calculate(int price){
        int oneMile = 20;
        int miles = 0;

        if (price>0) {
            miles = price / oneMile;
        }
        return miles;
    }
}

