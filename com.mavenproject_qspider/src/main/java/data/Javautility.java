package data;

import java.util.Date;
import java.util.Random;

public class Javautility {
	/**
	 * Random class
	 * @return
	 */
	public int getRandom()
	{
	Random r=new Random();
	int num=r.nextInt(1000);
	return num;
	
	}
	/**
	 * creating data
	 */
	public Date getDate()
	{
		Date d=new Date();
		return d;
	}
	/**
	 * creating customised date 
	 */
	public String getFormattedDate()
	{
		Date da=new Date();
		String[] date=da.toString().split(" ");
		String nd=date[2]+"-"+date[1]+"-"+date[5];
		return nd;
	}
}
