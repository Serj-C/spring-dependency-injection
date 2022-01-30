package main.dependency_injection;

import com.example.method_replacement.ReplacementTarget;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MethodReplacementDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/spring/app-context-xml.xml");
        ctx.refresh();

        ReplacementTarget replacementTarget = (ReplacementTarget) ctx.getBean("replacementTarget");
        ReplacementTarget standardTarget = (ReplacementTarget) ctx.getBean("standardTarget");

        displayInfo(replacementTarget);
        displayInfo(standardTarget);

        ctx.close();
    }

    private static void displayInfo(ReplacementTarget target) {
        System.out.println(target.formatMessage("Thanks for playing, try again!"));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int x = 0; x < 100000; x++) {
            String out = target.formatMessage("No filter in my head");
            //commented to not pollute the console
            //System.out.println(out);
        }
        stopWatch.stop();

        System.out.println("100000 invocations took: "
                + stopWatch.getTotalTimeMillis() + " ms\n");
    }
}
