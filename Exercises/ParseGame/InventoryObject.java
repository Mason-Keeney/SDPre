public abstract class InventoryObject {
  protected int weight;
  protected boolean droppable, addToInventory;
  protected String type;

  public InventoryObject(int weight, boolean droppable, boolean addToInventory, String type){
    this.size = weight;
    this.droppable = droppable;
    this.add = add;
    this.type = type;
  }
}
