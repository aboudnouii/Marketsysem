package time;

public class Date {
	private int day;
	private int mounth;
	private int year;

	public Date(int day, int mounth, int year) {
		if (checkDate(day, mounth, year)) {
			this.day = day;
			this.mounth = mounth;
			this.year = year;
		}
	}

	public boolean checkDate(int day, int mounth, int year) {
		int[] mounth1 = { 1, 3, 5, 7, 8, 10, 12 };
		int[] mounth2 = { 4, 6, 9, 11 };
		if (year < 0)
			return false;
		if (mounth > 12 || mounth < 0)
			return false;
		if (day > 31 || day < 1)
			return false;
		if (day == 31) {
			int i = 0;
			for (; i < mounth1.length && mounth1[i] != mounth; i++)
				;
			if (i == mounth1.length)
				return false;
		}
		if (day == 30) {
			int i = 0;
			for (; i < mounth2.length && mounth2[i] != mounth; i++)
				;
			if (i == mounth1.length)
				return false;
		}
		if (day == 29 && year % 4 != 0)
			return false;
		return true;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMounth() {
		return mounth;
	}

	public void setMounth(int mounth) {
		this.mounth = mounth;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int compareWith(Date otherDate) {
		if (year <= otherDate.getYear()) {
			if (mounth <= otherDate.getMounth()) {
				if (day < otherDate.getDay()) {
					return -1; // otherDate bigger then this date
				}
			}
		}
		if (year == otherDate.getYear() && mounth == otherDate.getMounth() && day == otherDate.getDay())
			return 0;
		return 1;
	}

	public Date earliest(Date otherDate) {
		return (compareWith(otherDate) == -1) ? this : ((compareWith(otherDate) == 1) ? otherDate : this);
		// otherDate bigger then this date
	}

	public String toString() {
		return "Date : " + day + '/' + mounth + '/' + year;
	}
}
