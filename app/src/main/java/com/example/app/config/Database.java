import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Database {
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/java")
                .username("root")
                .password("")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }
}
