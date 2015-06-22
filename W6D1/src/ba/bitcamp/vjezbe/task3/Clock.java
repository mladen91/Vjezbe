package ba.bitcamp.vjezbe.task3;

public class Clock implements WriteableClock {

	private int hour;
	private int minute;
	private int seconds;

	public Clock(int hour, int minute, int seconds) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}

	@Override
	public void addToFile(String filename, int format) {
		if (format == MILITARY_FORMAT) {
			String s = hour + ":" + minute + ":" + seconds;
			writeToFile(filename, s);
		} else if (format == AMPM_FORMAT) {
			if (hour > 12) {
				hour -= 12;
				String s = hour + ":" + minute + ":" + seconds+" PM";
				writeToFile(filename, s);	
			}else if(hour<=12){
			String s = hour + ":" + minute + ":" + seconds+" AM";
			writeToFile(filename, s);
			}
		} else if (format == AMPM_FORMAT_NO_SECONDS) {
			if (hour > 12) {
				hour -= 12;
				String s = hour + ":" + minute+" PM";
				writeToFile(filename, s);
			}else if (hour<=12){
			String s = hour + ":" + minute+" AM";
			writeToFile(filename, s);
			}
		} else if (format == MILITARY_FORMAT_NO_SECONDS) {
			String s = hour + ":" + minute;
			writeToFile(filename, s);
		}

	}

}
