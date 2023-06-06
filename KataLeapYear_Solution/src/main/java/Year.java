public class Year {
    int year;

    public Year(int year) {
        this.year = year;
    }

    public Year() {
    }

    public boolean leapYear(int years) {
        return divisibleBy(years,4) && !(divisibleBy(years,100) && notDivisible(years,400));
    }

    private boolean notDivisible(int years,int number) {return years % number != 0;}

    private boolean divisibleBy(int years,int number) {
        return years % number == 0;
    }
}
