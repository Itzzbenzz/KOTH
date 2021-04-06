package com.benzimmer123.koth.api.objects;

import java.time.ZonedDateTime;
import java.util.List;

public interface KOTHScheduler {

	/**
	 * Method to add a specific date schedule
	 *
	 * @param ZonedDateTime date
	 * @param int requiredTime (use -1 if using point system)
	 * @param int maxRunTime
	 * @param int maxPoints (use -1 if using timer system)
	 * 
	 */
	void addSchedule(ZonedDateTime date, int requiredTime, int maxRunTime, int maxPoints);

	/**
	 * Method to add a daily schedule
	 *
	 * @param ZonedDateTime date
	 * @param int requiredTime (use -1 if using point system)
	 * @param int maxRunTime
	 * @param int maxPoints (use -1 if using timer system)
	 * 
	 */
	void addDaily(ZonedDateTime date, int requiredTime, int maxRunTime, int maxPoints);

	/**
	 * Method to add a weekly schedule
	 *
	 * @param ZonedDateTime date
	 * @param int requiredTime (use -1 if using point system)
	 * @param int maxRunTime
	 * @param int maxPoints (use -1 if using timer system)
	 * 
	 */
	void addWeekly(ZonedDateTime date, int requiredTime, int maxRunTime, int maxPoints);

	/**
	 * Method to check all schedules and see if they have expired
	 *
	 * @return List of expired Schedules
	 * 
	 */
	List<Schedule> checkAllSchedules();

	/**
	 * Method to remove a schedule
	 *
	 * @param Schedule
	 * 
	 */
	void remove(Schedule schedule);

	/**
	 * Method to return the Schedule from an id
	 *
	 * @param int id
	 * @return Schedule
	 * 
	 */
	Schedule getSchedule(int id);

	/**
	 * Method to get the next schedule id
	 *
	 * @return int
	 * 
	 */
	int getNextId();

	/**
	 * Method to check if this a random schedule and not linked to a koth
	 *
	 * @return boolean
	 * 
	 */
	boolean isRandom();

	/**
	 * Method to get a list of all schedules for this koth
	 *
	 * @return List of Schedules
	 * 
	 */
	List<Schedule> getScheduled();

}