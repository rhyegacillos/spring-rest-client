package guru.springframework.api.domain;

import java.util.List;

public class UserData {

    public List<User> data;

    public List<User> getData() {
        return this.data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
