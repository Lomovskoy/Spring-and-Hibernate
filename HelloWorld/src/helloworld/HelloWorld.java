package helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXrnlApplicationContext;
import java.util.Properties;
/**
 *
 * @author imxo
 */
public class HelloWorld {

    /**
     * Главный метод класса
     *
     * @param args
     */
    public static void main(String[] args) {

        MessageRenderer mr = MessageSupportFactory.getlnstance().
                getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getlnstance().
                getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }

    /**
     * простой интерфейс MessageProvider с единственным методом getMessage ()
     */
    public interface MessageProvider {

        String getMessage();
    }

    /**
     * Как видите, интерфейс MessageRenderer имеет метод render () и также метод
     * setMessageProvider () в стиле JavaBean.
     */
    public interface MessageRenderer {

        void render();

        void setMessageProvider(MessageProvider provider);

        MessageProvider getMessageProvider();
    }

    /**
     * простой интерфейс M e s s a g e P r o vider, который всег да возвращает в
     * качестве сообщения строку "Hello World!".
     */
    public class HelloWorldМessageProvider implements MessageProvider {

        @Override
        public String
                getMessage() {
            return "Hello World!";
        }
    }

    public class StandardOutMessageRenderer implements MessageRenderer {

        private MessageProvider messageProvider;

        @Override
        public void render() {
            if (messageProvider == null) {
                throw new RuntimeException(
                        "Вы должны установить свойство messageProvider класса: "
                        + StandardOutMessageRenderer.class.getName());
            }
            System.out.println(messageProvider.getMessage());
        }

        @Override
        public void setMessageProvider(MessageProvider provider) {
            this.messageProvider = provider;
        }

        @Override
        public MessageProvider getMessageProvider() {
            return this.messageProvider;
        }
    }

    public class MessageSupportFactory {

        private static MessageSupportFactory instance;
        private Properties props;
        private MessageRenderer renderer;
        private MessageProvider provider;

        private MessageSupportFactory() {

            props = new Properties();

            try {
                props.load(new FileinputStream(
                        "com/apress/prospring4/ch2/msf.properties"));
                String rendererClass = props.getProperty("renderer.class");
                String providerClass = props.getProperty("provider.class");
                renderer = (MessageRenderer) Class.forName(rendererClass).newinstance();
                provider = (MessageProvider) Class.forName(providerClass).newinstance();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getinstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {

        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
