public class Main {
    public static void main(String[] args) {
        int numberOfTicket = 1;
        while (numberOfTicket < 1_000_000) {
            int a = numberOfTicket % 10;
            int b = numberOfTicket / 10 % 10;
            int c = numberOfTicket / 100 % 10;
            int d = numberOfTicket / 1000 % 10;
            int e = numberOfTicket / 10000 % 10;
            int f = numberOfTicket / 100000 % 10;
            if (a + b + c == d + e + f && numberOfTicket >= 100_000) {
                System.out.println(numberOfTicket);
            } else if (a + b + c == d + e + f && numberOfTicket <= 9_999) {
                System.out.println("00" + numberOfTicket);
            } else if ( a + b + c == d + e + f && numberOfTicket >= 10_000 &&
            numberOfTicket <= 99_999)
                System.out.println("0"+ numberOfTicket);
                numberOfTicket++;
        }
    }
}