package jskipp.citysim.buildings;

import java.awt.Rectangle;

/**
 * A simple house object.
 * 
 * @author jskipp
 *
 */
public class House {
   
   /**
    * A rectangle representing the foundation of the
    * house.
    */
   private Rectangle area;
   
   /**
    * An integer representing the height of the house.
    */
   private int height;
   
   /**
    * Default constructor.
    */
   public House() {
      this.area = new Rectangle(0,0);
   }
   
   /**
    * Constructor.
    * 
    * @param area
    */
   public House(Rectangle area) {
      this.area = area;
   }
   
   /**
    * Copy Constructor.
    * 
    * @param newHouse
    */
   public House(House newHouse) {
      this.area = newHouse.getArea();
   }
   
   /**
    * Returns a deep copy of the Rectangle area.
    * 
    * @return area
    */
   public Rectangle getArea() {
      return new Rectangle(this.area);
   }
   
   /**
    * Sets a new value for Rectangle area.
    * 
    * @param area
    */
   public void setArea(Rectangle area) {
      this.area = new Rectangle(area);
   }
   
   /**
    * Returns the value of the int height.
    * 
    * @return height
    */
   public int getHeight() {
      return this.height;
   }
   
   /**
    * Sets a new value for int height.
    * 
    * @param height
    */
   public void setHeight(int height) {
      this.height = height;
   }

}
