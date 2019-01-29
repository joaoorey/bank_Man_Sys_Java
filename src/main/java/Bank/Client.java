package Bank;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Client {

    Branch branch:

    String Name, Address, Email, Profession;
    int ClientId, CC, Telephone, BranchId;
    List<Account>accounts;
    List<Card>cards;
}
