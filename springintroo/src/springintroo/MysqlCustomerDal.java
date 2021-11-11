package springintroo;

public class MysqlCustomerDal implements CustomerDalDao {

	@Override
	public void add() {
		System.out.println("Msql veritabanına eklendi");
		
	}
	
}
