package com.benzimmer123.koth.api.objects;

import java.util.List;

public interface KOTHDetails {

	/**
	 * Method to get a list of all reward commands
	 * 
	 * @return List of Strings
	 * 
	 */
	List<String> getRewardCmds();

	/**
	 * Method to add a reward command
	 * 
	 * @param String cmd
	 * 
	 */
	void addRewardCmd(String cmd);

	/**
	 * Method to set the list of broadcast times
	 * 
	 * @param List of Integers (as times in seconds)
	 * 
	 */
	void setBroadcastTimes(List<Integer> times);

	/**
	 * Method to get a list of all broadcast times
	 * 
	 * @return List of Integers
	 * 
	 */
	List<Integer> getBroadcastTimes();

	/**
	 * Method to set the capture time for the koth
	 * 
	 * @param int requiredTime
	 * 
	 */
	void setRequiredTime(int requiredTime);

	/**
	 * Method to set the chat delay timeout
	 * 
	 * @param int chatDelay
	 * 
	 */
	void setChatDelay(int chatDelay);

	/**
	 * Method to set the sync task id
	 * 
	 * @param int syncTaskID
	 * 
	 */
	void setSyncTaskID(int syncTaskID);

	/**
	 * Method to set the async task id
	 * 
	 * @param int asyncTaskID
	 * 
	 */
	void setAsyncTaskID(int asyncTaskID);

	/**
	 * Method to set the koth run time
	 * 
	 * @param int runTime
	 * 
	 */
	void setRunTime(int runTime);

	/**
	 * Method to set the koth max run time
	 * 
	 * @param int maxRunTime
	 * 
	 */
	void setMaxRunTime(int maxRunTime);

	/**
	 * Method to set the koth max points
	 * 
	 * @param int maxPoints
	 * 
	 */
	void setMaxPoints(int maxPoints);

	/**
	 * Method to set the koth capture time
	 * 
	 * @param int captureTime
	 * 
	 */
	void setCaptureTime(int captureTime);

	/**
	 * Method to set if chat broadcasts are disabled
	 * 
	 * @param boolean disabledChat
	 * 
	 */
	void setDisabledChat(boolean disabledChat);

	/**
	 * Method to get the koth run time
	 * 
	 * @return int
	 * 
	 */
	int getRunTime();

	/**
	 * Method to get the max run time
	 * 
	 * @return int
	 * 
	 */
	int getMaxRunTime();

	/**
	 * Method to get the max points
	 * 
	 * @return int
	 * 
	 */
	int getMaxPoints();

	/**
	 * Method to get the capture time left
	 * 
	 * @return int
	 * 
	 */
	int getCaptureTime();

	/**
	 * Method to get the required capture time
	 * 
	 * @return int
	 * 
	 */
	int getRequiredTime();

	/**
	 * Method to get the async task id
	 * 
	 * @return int
	 * 
	 */
	int getAsyncTaskID();

	/**
	 * Method to get the sync task id
	 * 
	 * @return int
	 * 
	 */
	int getSyncTaskID();

	/**
	 * Method to get the time until cooldown is over
	 * 
	 * @return int
	 * 
	 */
	int getChatDelay();

	/**
	 * Method to check if broadcasts are on cooldown
	 * 
	 * @return boolean
	 * 
	 */
	boolean getDisabledChat();

}
