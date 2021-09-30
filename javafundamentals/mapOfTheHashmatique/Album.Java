import java.util.HashMap;
import java.util.Set;
public class Album {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Old Town Road", "I'm gonna take my horse to the old town road, I'm gonna ride 'till I can't no more\n");
        userMap.put("Single Ladies", "All the single ladies, all the single ladies\nAll the single ladies, all the single ladies\nAll the single ladies, all the single ladies\n");
        userMap.put("Shake It Off", "Heartbreakers gonna break, break, break, break, break\nAnd the fakers gonna fake, fake, fake, fake, fake\nBaby, I'm just gonna shake, shake, shake, shake, shake\nI shake it off, I shake it off (Whoo-hoo-hoo)\n");
        userMap.put("Blinding Lights", "I said, ooh, I'm blinded by the lights\nNo, I can't sleep until I feel your touch\nI said, ooh, I'm drowning in the night\nOh, when I'm like this, you're the one I trust\n");

        System.out.println("Blinding Lights" + ":\n" + userMap.get("Blinding Lights") + "\n");

        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key + ":\n" + userMap.get(key));
    }
}
}