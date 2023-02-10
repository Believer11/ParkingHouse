import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyJDBC {
    public static void main(String[] args) {

    }
    public MyJDBC() {

    }

    public static boolean update(Vehicle v) {



        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkovisko", "root", "04061998");
//            PreparedStatement pstmt = connection.prepareStatement(sqlUpdate) {
//
////            Statement statement = connection.createStatement();
//                int currentId = 0;
//                int id = currentId++;
////                String name
//                String licensePlate = "";
            String sql = "insert into vehicle(id, name, licensePlate)" + "values (? , ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1,v.getId());
            pstmt.setString(2,v.getName());
            pstmt.setString(3,v.getLicensePlate());




        }catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}


//public class MyJDBC {
//    public static void main(String[] args) {
//
//        // TODO: return boolean
//        try {
//
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_invoicing", "root", "04061998");
//
//            Statement statement = connection.createStatement();
////            String name = "myCar";
////            String lP = "PD999DL";
//
////            int resultSet = statement.executeUpdate("INSERT INTO vehicle " + "VALUES (1, 'myCar', 'PD999DL')");
//            ResultSet resultSet = statement.executeQuery("select * from clients");
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name"));
//            }
////            if(resultSet == 1) {
////                System.out.println("done");
//            // TODO: return true if 1, if 0 return false
////            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}
//
////// TODO: 1 table parkingLots - nazov cislo maxkapacita
////// 2 - vehicle
////// 3 vehicleParkingLot - vehicleId parkingLotId