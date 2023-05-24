package com.ecommerce.service;

import com.ecommerce.model.User;

/*Design the web services to fetch all the list of user from database.
 * PragatiDabade
 */
public interface FetchUserService {
	public User getUserById(Integer Id);

}
