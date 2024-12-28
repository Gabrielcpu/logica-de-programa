package JavaCore.OExeceção.RuntimeTeste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.io.FileNotFoundException;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException |ArithmeticException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException |ArithmeticException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException ");
        } catch (RuntimeException e) {
            System.out.println("dentro do RuntimeException ");
        }
        try {
            TalvezLanceExepition();
        } catch (IOException | SQLException e) {
         e.printStackTrace();
        }
    }
    private static void TalvezLanceExepition () throws SQLException, IOException {
          //import
        }
    }

