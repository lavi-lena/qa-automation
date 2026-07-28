import java.util.ArrayList;
import java.util.List;

public class SmartLock {
    String lockId;
    List<User> insideHouse = new ArrayList<>();
    List<User> blackList = new ArrayList<>();

    SmartLock(String lockId) {
        this.lockId = lockId;
    }

    private boolean isBanned(User u) {
        for (User bUser : blackList) {
            if (u == bUser) {
                return true;
            }

        }
        return false;
    }

    void addToBlacklist(User u) {
        blackList.add(u);
    }

    void tryToEnter(User u) {
        if (isBanned(u)){
            System.out.println("Доступ заблокирован!");
        }
        else if (u.level == AccessLevel.OWNER) {
            insideHouse.add(u);
            System.out.println("Дверь открыта");

        } else if (u.level == AccessLevel.GUEST) {
            System.out.println("Ожидайте подтверждения хозяина");

        }
    }
}
