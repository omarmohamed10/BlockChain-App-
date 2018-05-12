
package assign3;


public class User {
    String password;
    int balance;
    String address;

    User(String pass, String address) {
          this.password=password;
        this.balance=0;
        this.address=address;
    }

    User() {
        
    }

    
    public void Create(String password,String address){
        this.password=password;
        this.balance=0;
        this.address=address;
        Assign3.users.addElement(this);
    }
   
    
    
}
