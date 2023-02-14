import java.sql.*;


public class MyJDBC {
    public static void main(String[] args) {

        // TODO: return boolean
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkovisko", "root", "04061998");

            Statement statement = connection.createStatement();
//

//            int resultSet = statement.executeUpdate("INSERT INTO vehicle " + "VALUES (1, 'myCar', 'PD999DL')");
            ResultSet resultSet = statement.executeQuery("select * from vehicle");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
//            if(resultSet == 1) {
//                System.out.println("done");
            // TODO: return true if 1, if 0 return false
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public boolean update(Vehicle v) {


        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkovisko", "root", "04061998");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from vehicle");
            String sql = "insert into vehicle(id, name, licensePlate)" + "values (? , ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, v.getId());
            pstmt.setString(2, v.getName());
            pstmt.setString(3, v.getLicensePlate());


        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public String getCars() throws SQLException {
        //TODO vyber auta z databazy
        String car = "";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkovisko", "root", "04061998");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM vehicle");
            while (resultSet.next()) {
                car = resultSet.getString("car_id");
//                String license_plate = resultSet.getString("idlicense_plate");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return car;
    }

    //TODO vymaz auto z databazy pomocou id - tabulka
    public boolean deleteCar(int id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkovisko", "root", "04061998");
            Statement statement = connection.createStatement();
            String query = "delete from vehicle where car_id = " + id;
            statement.executeUpdate(query);
            System.out.println("Record is deleted from the table successfully ....");
        } catch (Exception e) {
            e.printStackTrace();


        }
        return false;
    }

    public String read(int id) throws SQLException {
        String answer = "";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkovisko", "root", "04061998");
            String sql = "SELECT license_plate FROM vehicle WHERE id = " + id;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                answer = resultSet.getString("id");
                System.out.println("Your data is here" + answer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return answer;
    }
}


//    public String read() throws SQLException {
//        String answer = "";
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkovisko", "root", "04061998");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM vehicle WHERE idvehicle = " + id);
//            ResultSetMetaData md = resultSet.getMetaData();
//            int numCols = md.getColumnCount();
//            List<String> colNames = IntStream.range(0, numCols)
//                    .mapToObj(i -> {
//                        try {
//                            return md.getColumnName(i + 1);
//                        } catch (SQLException e) {
//                            e.printStackTrace();
//                            return "?";
//                        }
//                    })
//                    .collect(Collectors.toList());

//            JSONArray result = new JSONArray();
//            while (resultSet.next()) {
//                JSONObject row = new JSONObject();
//                colNames.forEach(cn -> {
//                    try {
//                        row.put(cn, resultSet.getObject(cn));
//                    } catch (JSONException | SQLException e) {
//                        e.printStackTrace();
//                    }
//                });
//                result.add(row);
//            }
//
//                }
//
//
//
//}
//
//            System.out.println("Your data is here" + answer);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return answer;
///}






