import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main3 {

	public static void main(String[] args) throws ParseException {

		//OBTENDO UM VALOR DA DATA (ANO, MES, DIA, HORA, MINUTO)
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE); //OBTENDO MINUTO
		int month = 1 + cal.get(Calendar.MONTH); //OBTENDO MES
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}
