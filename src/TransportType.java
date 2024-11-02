public enum TransportType {

    /*
        TransportType деген enum туз. Ичине ар кандай типтеги унааларды жаз. Мисалы: CAR, BUS, TRUCK.
        Enum-дын ичинде бир  метод болсун: public  double calculateTravelCost(double distance);
        Бул метод транспорттун ар бир түрү үчүн өзүнүн жол баасын эсептеп чыгышы керек.
        (CAR)  Автоунаанын бир километринин баасы $0,1.
        (BUS)  Автобустун бир километринин баасы $0,05
        (TRUCK.) Трак үчүн бир километрдин баасы $0,02
     */


    CAR(0.1),
    BUS(0.05),
    TRUCK(0.02);


    private final double costPerKm;


    TransportType(double costPerKm) {
        this.costPerKm = costPerKm;
    }



    public double calculateTravelCost(double distance) {
        return distance * costPerKm;
    }




}
