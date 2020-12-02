public class NextDayCalculator {

    public static boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
        }
        return true;
    }

    public static int getMaxDayOfMonth(int month, int year){
        int maxDayOfMonth;
        switch (month){
            case 2:
                if (isLeapYear(year)){
                    return maxDayOfMonth = 29;
                }else {
                    return maxDayOfMonth = 28;
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return maxDayOfMonth = 31;
            case 6:
            case 9:
            case 11:
                return maxDayOfMonth = 30;
            default:
                return -1;
        }
    }
    public static String nextDay(int day, int month, int year){
        int maxDayOfMonth = getMaxDayOfMonth(month, year);
        if (maxDayOfMonth == -1 || day < 1 || day > maxDayOfMonth) return "Nhap sai";

        day++;
        if (day > maxDayOfMonth){
            day = 1;
            month++;
        }
        if (month > 12){
            month = 1;
            year++;
        }
        return day + "/" + month + "/" + year;
    }
}

