import org.junit.Before;
import org.junit.Test;
import seung.spring4.sungjukv6.model.SungJukVO;
import seung.spring4.sungjukv6.service.SungJukV6Service;
import seung.spring4.sungjukv6.service.SungJukV6ServiceImpl;

import static org.junit.Assert.assertEquals;

public class SungJukV6ServiceTest {

    SungJukV6Service sjsrv;

    @Before
    public void setup() {
        sjsrv = new SungJukV6ServiceImpl(null);
    }

    @Test
    public void test1() {
        SungJukVO sj = new SungJukVO("test1", 99,99,99);

        sjsrv.computeSungJuk(sj);

        assertEquals(297, sj.getTot());
        assertEquals(99, sj.getAvg(), 0.0);
        assertEquals('수', sj.getGrd());
    }

}
