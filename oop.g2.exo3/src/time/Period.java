package time;

import java.time.LocalDate;

public class Period {
	private Date startDate;
	private Date endDate;

	public Period(Date startDate, Date endDate) {
		if(startDate.compareWith(endDate) <=0)
		{this.startDate = startDate;
		this.endDate = endDate;}
	}

	public Period(Date endDate) {
		LocalDate Date2 = LocalDate.now();
		// Date currentDate = new Date(Date2.getDayOfMonth(), Date2.getMonthValue(),
		// Date2.getYear());
		this.startDate = new Date(Date2.getDayOfMonth(), Date2.getMonthValue(), Date2.getYear());// currentDate;
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public boolean before(Period otherperiod) {
			if (getEndDate().compareWith(otherperiod.getStartDate()) == 1)
				return false;
		return true;
	}
	public String toString() {
		return "Start :"+startDate+"\n End :"+endDate+"\n";
	}
}
