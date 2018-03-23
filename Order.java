import java.util.List;

public abstract class Order {

  public Integer identifier;

  public Integer cost;

  public String status;

  public List<Product> products;

  public List<Order>  myHistoryCommands;

  public Integer getIdentifier() {
  return null;
  }

  public Integer getCost() {
  return null;
  }

  public void newOperation() {
  }

  public String getStatus() {
  return null;
  }
  void setStatus(String status) { this.status = status; }

}