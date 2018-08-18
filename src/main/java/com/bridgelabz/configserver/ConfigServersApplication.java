/********************************************************************************* *
 * Purpose: To create an implementation to GoogleKeep(ToDoApplication) and microservices.
 * Creating a config server which is having the common configuration are kept and maintained
 * @author Saurav Manchanda
 * @version 1.0
 * @since 13/08/2018
 *********************************************************************************/
package com.bridgelabz.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Saurav
 *         <p>
 *         This class is for enabling the config server where all configurable
 *         parameters of microservices are written and maintained.
 *         </p>
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServersApplication.class, args);
	}
}
