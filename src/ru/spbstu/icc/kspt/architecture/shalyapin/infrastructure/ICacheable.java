package ru.spbstu.icc.kspt.architecture.shalyapin.infrastructure;

/**
 * @author Nikita Shalyapin
 * 
 *         Interface for cacheable objects. Such objects can be stored and
 *         received from cache.
 *
 * @param Type of object
 */
public interface ICacheable {
	/**
	 * Get identification number, stored in object. This id will be used as a
	 * key for cache.
	 * 
	 * @return object's identification number
	 */
	public Long getId();
}
