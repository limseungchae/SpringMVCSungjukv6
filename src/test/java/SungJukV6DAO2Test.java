import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import seung.spring4.sungjukv6.model.SungJukVO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:root-context.xml"})
public class SungJukV6DAO2Test {

    @Autowired SqlSession sqlSession;

    @Test
    public void selectSungJuk() {
        assertNotNull(sqlSession.selectList("sungjuk.selectsql"));
    }

    @Test
    public void selectOneSungJuk() {
        assertNotNull(sqlSession.selectOne("sungjuk.selectonesql", 5));
    }

    @Test
    public void insertSungJuk() {
        SungJukVO sj = new SungJukVO("testme", 99,99,99);
        sj.setTot(297); sj.setAvg(99.0); sj.setGrd('수');

        assertEquals(1, sqlSession.insert("sungjuk.insertsql", sj));
    }

    @Test
    public void updateSungJuk() {
        SungJukVO sj = new SungJukVO("testme", 99,99,99);
        sj.setTot(297); sj.setAvg(99.0); sj.setGrd('수');
        sj.setSjno(5);

        assertEquals(1, sqlSession.update("sungjuk.updatesql", sj));
    }

    @Test
    public void deleteSungJuk() {
        assertEquals(1, sqlSession.delete("sungjuk.deletesql", 5));
    }

}