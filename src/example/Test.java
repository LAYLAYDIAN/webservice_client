package example;

import com.webservice.client.helloWord.HelloWorldServiceLocator;
import com.webservice.client.helloWord.HelloWorld_PortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created by DIAN on 2019/4/27.
 */
public class Test {
    public static void main(String[] args) {

        try {
            HelloWorldServiceLocator  locator =  new HelloWorldServiceLocator();
            HelloWorld_PortType service = locator.getHelloWorld();
            String result = service.sayHelloWorldFrom("你好的三大");
            System.out.println(result);
        } catch (ServiceException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
