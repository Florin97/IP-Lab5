public class GetId {

  private static GetId instance;
  private Integer currentId;

  private GetId() {

  }

  public static GetId getInstance() {
    if(instance == null) {
      instance = new GetId();
    }

    return instance;
  }

  public Integer getId() {
  return ++currentId;
  }

}