package testtest.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MySqlRepository {
    
    private String SQL_GET_FIVE = 
    """
    SELECT name FROM game limit 5;
    """;
    
    @Autowired
    JdbcTemplate template;

    public List<String> getFive() {
        return template.queryForList(SQL_GET_FIVE, String.class);
    }
}
