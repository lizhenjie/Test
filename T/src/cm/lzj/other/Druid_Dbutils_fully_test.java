package cm.lzj.other;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Test;

import com.lzj.bean.PersonBean;

public class Druid_Dbutils_fully_test {

	@Test
	public void run(){
		DBUtilsHelper dbh = new DBUtilsHelper();
		QueryRunner runner = dbh.getRunner();
		try {
		 List<PersonBean> list=(List<PersonBean>) runner.query("select * from test",new BeanListHandler(PersonBean.class));
		for(PersonBean p:list)
		{
			System.out.println(p.getName());
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
