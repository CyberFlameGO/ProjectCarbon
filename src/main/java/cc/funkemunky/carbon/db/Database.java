package cc.funkemunky.carbon.db;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Getter
@Setter
public abstract class Database {
    private String name;
    private DatabaseType type;
    private Map<String, Object> databaseValues;

    public Database(String name, DatabaseType type) {
        this.name = name;
        this.type = type;

        databaseValues = new ConcurrentHashMap<>();
    }

    public abstract void loadDatabase();

    public abstract void saveDatabase();

    public abstract void inputField(String string, Object object);

    public abstract Object getField(String key);
}
