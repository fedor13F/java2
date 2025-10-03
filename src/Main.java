import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Zoo zoo1 = context.getBean("zooWithLion", Zoo.class);
        zoo1.performAnimalShow();

        Zoo zoo2 = context.getBean("zooWithMonkey", Zoo.class);
        zoo2.performAnimalShow();

        Zoo zoo3 = context.getBean("zooFromProperties", Zoo.class);
        zoo3.performAnimalShow();
    }
}