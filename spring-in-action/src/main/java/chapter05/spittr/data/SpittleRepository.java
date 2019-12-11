package chapter05.spittr.data;


import chapter05.spittr.Spittle;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SpittleRepository {

    List<Spittle> findRecentSpittles();

    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);

    void save(Spittle spittle);

}
