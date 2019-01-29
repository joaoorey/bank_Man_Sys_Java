package Bank;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Branch {

    int BranchClientAccount;
    int BranchId;
    String BranchAddress;
    List<Client> clients;
    List<ClientsAccount> clientsAccount;

}
