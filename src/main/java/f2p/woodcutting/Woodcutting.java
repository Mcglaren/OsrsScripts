package f2p.woodcutting;

import dax_api.api_lib.DaxWalker;
import dax_api.api_lib.models.DaxCredentials;
import dax_api.api_lib.models.DaxCredentialsProvider;
import net.runelite.rsb.script.Script;
import net.runelite.rsb.script.ScriptManifest;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@ScriptManifest(
        authors = { "Baby Future" }, name = "Basic Loop Bot", version = 0.1,
        description = "<html><head>"
        + "</head><body>"
        + "<center>Basic example that kills chickens</center>"
        + "</body></html>"
)

public class Woodcutting extends Script {

    private static Logger log = LoggerFactory.getLogger(Woodcutting.class);

    private final int MIN = random(250, 400); // Random minimum value for our loop
    private final int MAX = random(700, 900); // Random maximum value for our loop

    @Override
    public int loop() {

        // Randomize how often we loop
        // Ideally we can use PlayerProfile's that make this random per user/bot
        return random(MIN, MAX);
    }

    @Override
    public boolean onStart() {
        // Pass DaxWalker credentials
        DaxWalker.setCredentials(new DaxCredentialsProvider() {
            @Override
            public DaxCredentials getDaxCredentials() {
                return new DaxCredentials("sub_DPjXXzL5DeSiPf", "PUBLIC-KEY");
            }
        });
        return true;
    }


}
