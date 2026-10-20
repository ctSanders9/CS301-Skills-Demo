public class CustomDate {
    public static void main(String[] args) {

    }
    public static class CoolerDate{
        private final int month;
        private final int day;
        private final int year;

        private static final int[] availableDays = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        public CoolerDate(int givenMonth, int givenDay, int givenYear){
            month = givenMonth; day = givenDay; year = givenYear;
        }
        public static int NumOfDays(CoolerDate first, CoolerDate second){
            int daysBetween = 0;
            for (int i = 0; i < (Math.abs(second.month - first.month)-2); i++){
                daysBetween += availableDays[i];
            }
            for (int i = 0; i < (second.year - first.year); i++){
                daysBetween += 365;
            }

            return (availableDays[first.month] - first.day) + (availableDays[second.month] - second.day) + daysBetween;
        }

    }
}
