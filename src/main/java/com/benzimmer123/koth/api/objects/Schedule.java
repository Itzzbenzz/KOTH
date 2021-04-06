package com.benzimmer123.koth.api.objects;

import java.time.ZonedDateTime;

import com.benzimmer123.koth.api.enums.ScheduleType;

public interface Schedule {

	/**
	 * Method to check the ScheduleType
	 *
	 * @return boolean
	 * 
	 */
	ScheduleType getScheduleType();

	/**
	 * Method to check if this schedule has expired
	 *
	 * @return boolean
	 * 
	 */
	boolean ended();

	/**
	 * Method to get a schedule id
	 *
	 * @return int
	 * 
	 */
	int getId();

	/**
	 * Method to get required capture time
	 *
	 * @return int
	 * 
	 */
	int getRequiredTime();

	/**
	 * Method to get the amount of players required for start
	 *
	 * @return int
	 * 
	 */
	int getPlayersRequired();

	/**
	 * Method to get the date of the schedule
	 *
	 * @return ZonedDateTime
	 * 
	 */
	ZonedDateTime getDate();

	/**
	 * Method to get the maxruntime of the koth
	 *
	 * @return int
	 * 
	 */
	int getMaxRunTime();

	/**
	 * Method to get the maxpoints of the koth
	 *
	 * @return int
	 * 
	 */
	int getMaxPoints();

}