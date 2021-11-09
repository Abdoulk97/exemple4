
package Dev_tp2;

import java.io.Serializable;

public class Employee implements Serializable {
       public String name;
        public String address;
        public transient int SSN;
        public int number;
        
        public Employee(String name,String address,int SSN,int number){
            this.name=name;
            this.address=address;
            this.SSN=SSN;
            this.number=number;
        }
}
