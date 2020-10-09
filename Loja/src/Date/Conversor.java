package Date;

import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversor {
	Calendar c = Calendar.getInstance();
	Date data = c.getTime();

	public String Data() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return sdf.format(data);
	}
	
	public String Hora() {
		DateFormat hora = DateFormat.getTimeInstance();
		return hora.format(data);
	}
}
