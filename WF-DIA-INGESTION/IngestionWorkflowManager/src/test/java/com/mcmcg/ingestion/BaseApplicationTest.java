package com.mcmcg.ingestion;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 
 */

/**
 * @author jaleman
 *
 */
@WebAppConfiguration("src/test/java")
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class, classes = {IngestionWorkflowManagerConfigurationTest.class})
public abstract class BaseApplicationTest extends AbstractJUnit4SpringContextTests  {

	/**
	 * 
	 */
	public BaseApplicationTest() {
		// TODO Auto-generated constructor stub
	}

}
