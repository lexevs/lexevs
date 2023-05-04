package org.LexGrid.LexBIG.Impl.testUtility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

//import org.apache.ibatis.jdbc.ScriptRunner;
import org.lexevs.locator.LexEvsServiceLocator;

public class MonoLoadTestDataTest {
	
	public void testMonoLoad(String resource) {
		
        DataSource ds = LexEvsServiceLocator.getInstance().getLexEvsDatabaseOperations().getDataSource();
        try {
			Connection con = ds.getConnection();
//			ScriptRunner runner = new ScriptRunner(con);
//			runner.runScript(new BufferedReader(new FileReader("test.sql")));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
