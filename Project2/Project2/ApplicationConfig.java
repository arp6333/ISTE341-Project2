/**
 * Ellie Parobek
 * ISTE341 - Project 2
 * ApplicationConfig.java - Application Configuration for Project2.java.
 */
package Project2;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("resources")
class ApplicationConfig extends Application{

   @Override
   public Set<Class<?>> getClasses(){
      return getRestResourceClasses();
   }
   
   private Set<Class<?>> getRestResourceClasses(){
      Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
      resources.add(Project2.Project2.class);
      return resources;
   }
}