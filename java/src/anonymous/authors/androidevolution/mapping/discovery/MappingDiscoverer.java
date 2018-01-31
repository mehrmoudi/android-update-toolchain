package anonymous.authors.androidevolution.mapping.discovery;

import static anonymous.authors.androidevolution.Utils.log;

public abstract class MappingDiscoverer {

    private long startTime;
    private String helperName;

    protected MappingDiscoverer(String helperName) {
        this.helperName = helperName;
    }

    protected void onStart() {
        startTime = System.currentTimeMillis();
        log(helperName + " started");
    }

    protected void onFinish() {
        long totalTime = System.currentTimeMillis() - startTime;
        log(helperName + " took " + (totalTime/1000) + " seconds");
    }

}
