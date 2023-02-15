package shop.mtcoding.bankapp.model.history;

import java.util.List;

public interface HistoryRepository {
    public int insert(History user);

    public int updateById(History user);

    public int deleteById(int id);

    public List<History> findAll();

    public History findById(int id);
}