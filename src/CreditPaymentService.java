public class CreditPaymentService {
    public int calculate(int loanAmount, int loanTermInMonth, double monthlyRateInPercent) {
        //loanAmount-сумма кредита
        // loanTermInMonth-количество месяцев
        // monthlyRate-месячная процентная ставка
        double mRate = monthlyRateInPercent / 100 / 12;
        double monthPay = loanAmount * ((mRate * (Math.pow((1 + mRate), loanTermInMonth))) / ((Math.pow((1 + mRate), loanTermInMonth)) - 1));
        int monthlyPay = (int) monthPay;
        return monthlyPay;
    }
}
