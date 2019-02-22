import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.iwonder.alice.bas.dao.DataDictionaryDetailMapper;
import com.iwonder.alice.bas.view.BasDataDictionaryDetailView;

/**
 * @author mirror
 * @version 创建时间：2018年11月16日 下午4:25:45
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:conf/spring-mybatis.xml" })
public class TestDemo2 {
	@Autowired
	DataDictionaryDetailMapper basDao;

	@Transactional
	@Test
	public void test01() {
		BasDataDictionaryDetailView view = new BasDataDictionaryDetailView();
		view.setDictionaryDetailLabel("审核通过");
		List<BasDataDictionaryDetailView> seListWithLable = basDao.seListWithLable(view);
		System.out.println(seListWithLable);
	}
}
