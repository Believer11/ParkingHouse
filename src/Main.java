import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // TODO: vytvor parking lot, zacni parkovat, najprv jedno auto, neskor az po max pocet (zniz na 5), make sure ze sa to dojebe
        // na konci vypis vsetky auta v parking lote
        // harder, vypis aj na ako dlho maju parkovanie

        // TODO: najprv jedno parkovisko so 100 miestami kam pojdes parkovat, potom viac parkovisk za mna, ale ako chces :D

//
        List<ParkingLot> parkingLots = new ArrayList<>();
        MyJDBC m = new MyJDBC();
        Vehicle v = new Vehicle();
//        ParkingLot par = new BufferedReader(new StringReader(ParkingLot))

        for (int i = 0 ; i <4; i++) {
            ParkingLot p = new ParkingLot();
            parkingLots.add(p);
            ;

        }


//
//
////          User input
//
//        Scanner scanner = new Scanner(System.in);
//        String userAnswer = scanner.nextLine();

////        if (!parkingLots.isEmpty() && userAnswer.equalsIgnoreCase("YES"))
            if (!parkingLots.isEmpty()) {
                for (int i = 0; i < parkingLots.size(); i++) {
                    parkingLots.get(i).startParking();
                    System.out.println("Here is your parking lot " + parkingLots.get(i).toString());
//
//
////
//
//                    // TODO: parkinglot.getVehicles();
//

                }

            } else {
                System.out.println("Have a nice day");
                System.exit(0);


            }
//
//
        }



}
































