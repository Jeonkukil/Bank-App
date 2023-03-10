package shop.mtcoding.bankapp.model.account;

import java.util.List;

public interface AccountRepository {
    public int insert(Account user);

    public int updateById(Account user);

    public int deleteById(int id);

    public List<Account> findAll();

    public Account findById(int id);
}