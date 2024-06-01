package homework_nr_22;

import java.sql.*;
import java.util.Scanner;

public class HomeWork22 {
    private static final String INSERT_ALL_INTO_EMPLOYEE_INFO = "insert into students(name, age, grade, ismale) " +
            "values (?, ?, ?, ?)";
    private static final String UPDATE_GRADE_BY_ID = "update students set grade = ? where student_id = ?";

    private static final String DELETE_RECORD_FROM_STUDENTS = "delete from students where student_id = ?";
    private static final String GET_ALL_FROM_STUDENTS = "select * from students";

    public static void main(String[] args) throws SQLException {
        final String DB_URL = "jdbc:postgresql://localhost:5432/students_db";
        final String DB_USER = "postgres";
        final String DB_PASSWORD = "admin";

        boolean finish = false;

        Connection dbConnection = DB_Connection.setNewConnection(DB_URL, DB_USER, DB_PASSWORD);
        Scanner dbScanner = new Scanner(System.in);

        while (!finish) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose operation");
            System.out.println("Add new student: 1");
            System.out.println("Update student: 2");
            System.out.println("Delete student: 3");
            System.out.println("Get all records from students database: 4");
            System.out.println("Exit: 5");
            String operation = scanner.next();
            switch (operation) {
                case "1":
                    insertAllIntoStudents(dbConnection, dbScanner);
                    break;
                case "2":
                    updateRecord(dbConnection, dbScanner);
                    break;
                case "3":
                    deleteFromStudents(dbConnection, dbScanner);
                    break;
                case "4":
                    getAllRecords(dbConnection);
                    break;
                case "5":
                    finish = true;
                    dbConnection.close();
                    break;
            }
        }
    }

    public static void insertAllIntoStudents(Connection conn, Scanner scanner) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(INSERT_ALL_INTO_EMPLOYEE_INFO);
        System.out.println("Enter name:");
        preparedStatement.setString(1, scanner.next());
        System.out.println("Enter age:");
        preparedStatement.setInt(2, Integer.parseInt(scanner.next()));
        System.out.println("Enter grade:");
        preparedStatement.setInt(3, Integer.parseInt(scanner.next()));
        System.out.println("Enter is student male?");
        preparedStatement.setBoolean(4, Boolean.parseBoolean(scanner.next()));

        preparedStatement.executeUpdate();
    }

    public static void updateRecord(Connection conn, Scanner scanner) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(UPDATE_GRADE_BY_ID);
        System.out.println("Enter student ID:");
        preparedStatement.setInt(2, Integer.parseInt(scanner.next()));
        System.out.println("Enter new grade:");
        preparedStatement.setInt(1, Integer.parseInt(scanner.next()));

        preparedStatement.executeUpdate();
    }
    public static void deleteFromStudents(Connection conn, Scanner scanner) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(DELETE_RECORD_FROM_STUDENTS);
        System.out.println("Enter student`s id:");
        preparedStatement.setInt(1, Integer.parseInt(scanner.next()));

        preparedStatement.executeUpdate();
    }

    public static void getAllRecords(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(GET_ALL_FROM_STUDENTS);
        ResultSetMetaData rsmd = result.getMetaData();
        String[] columns = new String[rsmd.getColumnCount()];

        for (int index = 0; index != columns.length; index++) {
            columns[index] = rsmd.getColumnName(index + 1);
        }

        while (result.next()) {
            for (String element :
                    columns) {
                System.out.print(element + ":\t" + result.getString(element) + "\t");
            }
            System.out.println();
        }
    }
}
