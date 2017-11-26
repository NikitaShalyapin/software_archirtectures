package ru.spbstu.icc.kspt.architecture.shalyapin.domain;

/**
 * @author Nikita Shalyapin
 * 
 *         Interface for object witch can be temporary disabled.
 *
 */
public interface IEnableable {
	
	/**
	 * Check object enabled status.
	 * 
	 * @return enabled status.
	 */
	public Boolean isEnabled();

	/**
	 * Change status to enabled.
	 */
	public void setEnabled();

	/**
	 * Change status to disabled
	 */
	public void setDisabled();
}
