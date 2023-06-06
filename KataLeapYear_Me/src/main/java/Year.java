public class Year {
    int year ;

    public Year() {
    }

    public Year(int year) {
        this.year = year;
    }

    public boolean isNotLeapYearIsNotDivisibleByFour(int date) {
        return date % 4 == 0;
    }

    public boolean isLeapYearIsDivisibleByFour(int date) {
        return date % 4 == 0;
    }

    public boolean isLeapYearIsDivisibleByFourTeen(int date) {
        return date % 400 == 0;
    }

    public boolean isNotLeapYearIsNotDivisibleByFourTeenIsDivissibleByOneHundreed(int date) {
        return (date % 400 == 0) && (date % 100 != 0);
    }
}
