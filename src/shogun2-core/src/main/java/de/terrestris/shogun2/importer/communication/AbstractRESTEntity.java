package de.terrestris.shogun2.importer.communication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Daniel Koch
 * @author terrestris GmbH & Co. KG
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractRESTEntity {

	/**
	 * Default constructor.
	 */
	public AbstractRESTEntity() {

	}

}
