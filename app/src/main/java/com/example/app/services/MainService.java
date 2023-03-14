import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class MainService {
    private final DataSource dataSource;

    @Autowired
    public MyService(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
