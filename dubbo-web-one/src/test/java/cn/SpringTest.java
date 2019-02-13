package cn;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.baidu.service.Client;

/**
 * Description: spring单元测试  
 * @author zxw
 * Date:   2018年3月21日 
 */
 
//方式1：加载spring配置文件，代码方式
public class SpringTest {
	
	@Test
	public void solrTest() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-service.xml");
		Client client = (Client) context.getBean("client");
		
		for (int i = 0; i < 4; i++) {
			client.test();
		}
			
	}
	 
}
