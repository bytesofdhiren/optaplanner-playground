package opta.optawedding;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Table implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Table number")
   private int tableNumber;

   public Table()
   {
   }

   public int getTableNumber()
   {
      return this.tableNumber;
   }

   public void setTableNumber(int tableNumber)
   {
      this.tableNumber = tableNumber;
   }

   public Table(int tableNumber)
   {
      this.tableNumber = tableNumber;
   }

}