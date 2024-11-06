package DataStructures;

import java.util.HashSet;
import java.util.Set;

public class UsernameTracker {
    Set<String> info;

    public UsernameTracker() {
        this.info = new HashSet<>();
    }

    public void addUsername(String username){
        info.add(username);
    }
    public void removeUsername(String username) {
        info.remove(username);
    }

    public Set<String> getUsernames() {
        return info;
    }

    public static void main(String[] args) {
        UsernameTracker user = new UsernameTracker();
        user.addUsername("User2");
        user.addUsername("user123");
        user.removeUsername("User2");
        System.out.println("Usernames: " + user.getUsernames());
    }
}
