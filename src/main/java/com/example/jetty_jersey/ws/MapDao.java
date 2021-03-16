package com.example.jetty_jersey.ws;

import java.util.List;

public interface MapDao {

	/**
	 * @param User
	 * @return the list of maps of a specific user
	 */

	List<Map> getMaps(User user);
	
	/**
	 * @param map_id
	 * @return the map corresponding to the id
	 */

	Map getMap(int id);

	/**
	 * @return list of public maps
	 */

	List<Map> getPublicMaps();

	/**
	 * @param User (creator of the map), title of the map, description of the map
	 * @return the created map
	 */
	Map createMap(User user, String title, String description);

	/**
	 * @param Map to delete
	 * @return
	 */

	void removeMap(Map map);

}
