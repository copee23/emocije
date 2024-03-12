import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class MySqlTest1 extends BaseMySqlTest{

    @BeforeAll
    static void init(){
        setDataDumpMySqlFile("emocije_data_dump.sql");
        setEmptyDumpMySqlFile("emocije_drop_dump.sql");
        emptyData();
        fillData();
    }

    @Test
    void test() throws SQLException{
        statement.executeUpdate("INSERT INTO emocije VALUES(NULL, 'Radost',\"Ako si zbunjen i u poteškoćama imaj strpljenja, jer strpljenje je ključ za sreću.\")");
    }

    @AfterAll
    static void showResult(){
        showTable();
        emptyData();
    }


}
