public class User{
  byte[] inventory;
  String username;
  String password;
  String date;

  public User(){
    inventory = new byte[1];
  }

  public User(byte[] currInventory, String user, String pass, String dat){
    inventory = currInventory;
    username = user;
    password = pass;
    date = dat;
  }
  


}
