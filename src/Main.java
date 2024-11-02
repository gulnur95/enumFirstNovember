import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*  LMS   Task 1   LMS    Enum

        TransportType деген enum туз. Ичине ар кандай типтеги унааларды жаз. Мисалы: CAR, BUS, TRUCK.
        Enum-дын ичинде бир  метод болсун: public  double calculateTravelCost(double distance);
        Бул метод транспорттун ар бир түрү үчүн өзүнүн жол баасын эсептеп чыгышы керек.
        (CAR)  Автоунаанын бир километринин баасы $0,1.
        (BUS)  Автобустун бир километринин баасы $0,05
        (TRUCK.) Трак үчүн бир километрдин баасы $0,02
     */
        double distance = 100;
        for (TransportType transportType: TransportType.values()){
            System.out.println(transportType  +  " үчүн жол баасы:  $" + transportType.calculateTravelCost(distance));
        }



        /*    LMS    Task 2   LMS      Enum

        Күндөргө enum түзүңүз (Monday, Tuesday ...)   Консолдон бир күндү белгилеңиз.
Эгер Monday болсо - анда "Дуйшөмбү куну жава окуйм" же Tuesday болсо - анда  "Шейшемби күнү англис тили сабагын окуйм"
деп күнгө жараша кайсы сабакты окуганыңызды консолго чыгарыңыз. Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.  */


//        Scanner scanner = new Scanner(System.in);
//
//        while (true){
//        System.out.println("\nКүндү белгилеңиз:  MONDAY, TUESDAY, ..... ");
//        String day = scanner.nextLine().toUpperCase();
//
//            if(day.equals("Exit")){
//                System.out.println("Operation is stopped. ");
//                break;
//            }
//            switch(day) {
//            case "MONDAY":
//
//                System.out.println(Days.MONDAY.getName());
//                break;
//            case "TUESDAY":
//
//                System.out.println(Days.TUESDAY.getName());
//                break;
//            case "WEDNESDAY":
//                System.out.println(Days.WEDNESDAY.getName());
//                break;
//
//            case "THURSDAY":
//
//                System.out.println(Days.THURSDAY.getName());
//                break;
//            case "FRIDAY":
//
//                System.out.println(Days.FRIDAY.getName());
//                break;
//
//            case "SATURDAY":
//                System.out.println(Days.SATURDAY.getName());
//                break;
//            case "SUNDAY":
//                System.out.println(Days.SUNDAY.getName());
//                break;
//            default: {
//                System.out.println("Мындай күн жок! Дагы бир жолу аракет кылыңыз.");
//            }
//        }}















//                 Task 1    Enum
//        for(Regions regions: Regions.values()){
//            System.out.println(regions + "  " +  regions.getUnique());




          //   LMS    Task 1    Enum   variant 2

//        double distance = 100;
//        System.out.println("CAR үчүн жол баасы: $" + TransportType.CAR.calculateTravelCost(distance));
//        System.out.println("BUS үчүн жол баасы: $" + TransportType.BUS.calculateTravelCost(distance));
//        System.out.println("TRUCK үчүн жол баасы: $" + TransportType.TRUCK.calculateTravelCost(distance));
//


        }
}