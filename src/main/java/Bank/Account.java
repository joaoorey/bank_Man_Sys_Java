package Bank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {

    Branch branch;
    Client client;
    int AccId;
//    String Movements;
//    char AccountType;

}
