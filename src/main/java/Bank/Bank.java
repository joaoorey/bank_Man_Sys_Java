package Bank;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Bank {

    String Name;
    List<Branch> branches;

}
