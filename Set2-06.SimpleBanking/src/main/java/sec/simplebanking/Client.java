package sec.simplebanking;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Client extends AbstractPersistable<Long> {

    private String name;

    // DO SOMETHING HERE
    @OneToMany
    private List<Account> accounts = new ArrayList<>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<Account> getAccounts(){
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}
